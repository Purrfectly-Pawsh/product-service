package de.htw.productmicroservice.port.user;

import de.htw.productmicroservice.core.domain.model.Review;
import de.htw.productmicroservice.core.domain.service.interfaces.IReviewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/v1")
public class UserReviewController {

    private final IReviewService reviewService;

    public UserReviewController(IReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/products/{id}/reviews")
    public Iterable<Review> getReviewsByProductId(@PathVariable UUID id) {
        return this.reviewService.getAllByProductId(id);
    }
}
