package de.htw.productmicroservice.core.domain.service.interfaces;

import de.htw.productmicroservice.core.domain.model.Product;
import de.htw.productmicroservice.core.domain.service.impl.exception.ProductNotFoundException;
import java.util.UUID;


public interface IProductService {

    Iterable<Product> getAllProducts();

    Product getProductById(UUID id) throws ProductNotFoundException;

    Product createProduct(Product product);

    Iterable<Product> getProductsByKeyword(String keyword);

    void addProductToBasket(UUID productId, UUID basketId, int quantity);

    Product updateProduct(Product product);
}
