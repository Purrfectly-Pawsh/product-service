package de.htw.productmicroservice.core.domain.service.impl;

import de.htw.productmicroservice.core.domain.model.Product;
import de.htw.productmicroservice.core.domain.model.Review;
import de.htw.productmicroservice.core.domain.service.interfaces.IProductRepository;
import de.htw.productmicroservice.core.domain.service.interfaces.IProductService;
import de.htw.productmicroservice.core.domain.service.interfaces.IReviewRepository;
import de.htw.productmicroservice.core.domain.service.interfaces.IReviewService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ReviewService implements IReviewService {

    private final IReviewRepository reviewRepository;

    private final IProductRepository productRepository;

    public ReviewService(IReviewRepository reviewRepository, IProductRepository productRepository) {
        this.reviewRepository = reviewRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Review> getAllByProductId(UUID productId) {
        return this.reviewRepository.findAllByProductId(productId);
    }

    @Override
    public Review createReview(UUID productId, Review review) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        review.setProduct(product);
        return this.reviewRepository.save(review);
    }
}
