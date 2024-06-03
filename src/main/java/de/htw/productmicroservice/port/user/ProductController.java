package de.htw.productmicroservice.port.user;

import de.htw.productmicroservice.core.domain.model.Product;
import de.htw.productmicroservice.core.domain.service.interfaces.IProductService;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/v1")
public class ProductController {

    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable UUID id) {
        return productService.getProductById(id);
    }

    @GetMapping("/products/search")
    public Iterable<Product> getProductsByKeyword(@RequestParam String keyword) {
        return productService.getProductsByKeyword(keyword);
    }
}
