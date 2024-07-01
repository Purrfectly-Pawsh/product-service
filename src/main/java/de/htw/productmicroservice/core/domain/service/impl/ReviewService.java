package de.htw.productmicroservice.core.domain.service.impl;

import de.htw.productmicroservice.core.domain.model.Review;
import de.htw.productmicroservice.core.domain.service.interfaces.IReviewRepository;
import de.htw.productmicroservice.core.domain.service.interfaces.IReviewService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ReviewService implements IReviewService {

    private final IReviewRepository reviewRepository;

    public ReviewService(IReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Iterable<Review> getAllByProductId(UUID productId) {
        return this.reviewRepository.findAllByProductId(productId);
    }

    @Override
    public Review createReview(Review review) {
        return this.reviewRepository.save(review);
    }
}
