package de.htw.productmicroservice.core.domain.service.interfaces;

import de.htw.productmicroservice.core.domain.model.Product;

import java.util.UUID;


public interface IProductService {

    Iterable<Product> getAllProducts();

}
