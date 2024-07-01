package de.htw.productmicroservice.core.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String author;
    private String content;
    private int rating;
    private String title;
    @DateTimeFormat(pattern = "dd/mm/yyyy HH:mm")
    private LocalDateTime date;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "product_id"), nullable = false)
    @JsonIgnore
    private Product product;
}
