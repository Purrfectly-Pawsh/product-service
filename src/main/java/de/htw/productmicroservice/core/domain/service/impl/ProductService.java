package de.htw.productmicroservice.core.domain.service.impl;

import de.htw.productmicroservice.core.domain.model.Category;
import de.htw.productmicroservice.core.domain.model.Product;
import de.htw.productmicroservice.core.domain.service.impl.exception.ProductNotFoundException;
import de.htw.productmicroservice.core.domain.service.interfaces.IBasketProducer;
import de.htw.productmicroservice.core.domain.service.interfaces.IProductRepository;
import de.htw.productmicroservice.core.domain.service.interfaces.IProductService;
import org.springframework.stereotype.Service;
import java.util.UUID;


@Service
public class ProductService implements IProductService {

    private final IProductRepository productRepository;
    private final IBasketProducer basketProducer;

    public ProductService(IProductRepository productRepository, IBasketProducer basketProducer) {
        this.productRepository = productRepository;
        this.basketProducer = basketProducer;
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(UUID id) throws ProductNotFoundException {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Iterable<Product> getProductsByKeyword(String keyword) {
        Category categoryFromKeyword;
        try {
            categoryFromKeyword = Category.valueOf(keyword.toUpperCase());
        } catch (IllegalArgumentException e) {
            categoryFromKeyword = null;
        }
        return productRepository.
                findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCaseOrCategoryOrProducerContainingIgnoreCase(
                keyword, keyword, categoryFromKeyword, keyword);
    }

    @Override
    public void addProductToBasket(UUID productId, UUID basketId, int quantity) {
        Product product = productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException(productId));
        basketProducer.triggerAddProductToBasketEvent(product, basketId, quantity);

    }

}
