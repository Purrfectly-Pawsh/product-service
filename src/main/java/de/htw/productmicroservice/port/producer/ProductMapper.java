package de.htw.productmicroservice.port.producer;


import de.htw.productmicroservice.core.domain.model.Product;

import java.util.UUID;

public class ProductMapper {

    public static ProductMessage toProductMessage(Product product, UUID basketId, int quantity) {
        return ProductMessage.builder()
                .productId(product.getId().toString())
                .userId(basketId.toString())
                .name(product.getName())
                .unitPrice(product.getPrice())
                .description(product.getDescription())
                .imageLink(product.getImageUrl())
                .quantity(quantity)
                .build();
    }

}
