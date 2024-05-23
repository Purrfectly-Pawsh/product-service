package de.htw.productmicroservice.core.domain.service.impl.exception;

import java.util.UUID;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(UUID id) {
        super("Product " + id + " not found");
    }
}
