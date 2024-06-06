package de.htw.productmicroservice.core.domain.service.interfaces;

import de.htw.productmicroservice.core.domain.model.Product;

import java.util.UUID;

public interface IBasketProducer {

    void triggerAddProductToBasketEvent(Product product, UUID basketId, int quantity);

}
