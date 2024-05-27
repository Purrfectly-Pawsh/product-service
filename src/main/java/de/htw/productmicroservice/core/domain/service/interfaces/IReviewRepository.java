package de.htw.productmicroservice.core.domain.service.interfaces;

import de.htw.productmicroservice.core.domain.model.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IReviewRepository extends CrudRepository<Review, UUID> {
    Iterable<Review> findAllByProductId(UUID productId);
}
