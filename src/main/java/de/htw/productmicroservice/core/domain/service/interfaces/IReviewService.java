package de.htw.productmicroservice.core.domain.service.interfaces;


import de.htw.productmicroservice.core.domain.model.Review;

import java.util.UUID;

public interface IReviewService {

    Iterable<Review> getAllByProductId(UUID productId);

    Review createReview(UUID productId, Review review);
}
