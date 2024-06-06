package de.htw.productmicroservice.port.producer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductMessage {

    private String productId;
    private String userId;
    private String name;
    private BigDecimal unitPrice;
    private String description;
    private String imageUrl;
    private int quantity;

}
