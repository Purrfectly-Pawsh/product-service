package de.htw.productmicroservice.port.user;

import de.htw.productmicroservice.core.domain.model.Product;
import de.htw.productmicroservice.core.domain.service.interfaces.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;
import java.util.Map;


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

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable UUID id) {
        return productService.getProductById(id);
    }

    @GetMapping("/products/search")
    public Iterable<Product> getProductsByKeyword(@RequestParam String keyword) {
        return productService.getProductsByKeyword(keyword);
    }

    @PostMapping("/baskets/{basketId}")
    public ResponseEntity<?> addProductToBasket(
            @PathVariable UUID basketId, @RequestBody Map<String, Object> productJson) {
        UUID productId = UUID.fromString(productJson.get("productId").toString());
        int quantity = Integer.parseInt(productJson.get("quantity").toString());
        productService.addProductToBasket(productId, basketId, quantity);
        return ResponseEntity.ok().build();
    }

}
