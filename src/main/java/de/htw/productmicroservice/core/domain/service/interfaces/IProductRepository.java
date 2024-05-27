package de.htw.productmicroservice.core.domain.service.interfaces;

import de.htw.productmicroservice.core.domain.model.Category;
import de.htw.productmicroservice.core.domain.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IProductRepository extends CrudRepository<Product, UUID> {
    Iterable<Product> findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCaseOrCategoryOrProducerContainingIgnoreCase(String name, String description, Category category, String producer);
}



