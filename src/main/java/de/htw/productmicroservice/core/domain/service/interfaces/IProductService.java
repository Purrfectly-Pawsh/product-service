package de.htw.productmicroservice.core.domain.service.interfaces;

import de.htw.productmicroservice.core.domain.model.Category;
import de.htw.productmicroservice.core.domain.model.Product;
import de.htw.productmicroservice.core.domain.service.impl.exception.ProductNotFoundException;

import java.util.UUID;


public interface IProductService {

    Iterable<Product> getAllProducts();

    Product getProductById(UUID id) throws ProductNotFoundException;

    Iterable<Product> getProductsByKeyword(String keyword);

}
