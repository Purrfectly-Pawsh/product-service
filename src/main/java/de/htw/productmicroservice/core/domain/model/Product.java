package de.htw.productmicroservice.core.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(length = 500)
    private String name;
    @Column(length = 1200)
    private String description;
    private BigDecimal price;
    @Column(length = 1000)
    private String imageUrl;
    @Enumerated(EnumType.STRING)
    private Category category;
    private String producer;
}
