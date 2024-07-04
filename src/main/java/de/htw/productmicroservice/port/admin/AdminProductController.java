package de.htw.productmicroservice.port.admin;

import de.htw.productmicroservice.core.domain.model.Product;
import de.htw.productmicroservice.core.domain.service.interfaces.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1")
public class AdminProductController {

    private final IProductService productService;

    public AdminProductController(IProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @DeleteMapping("/products/{productId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable UUID productId) {
        productService.deleteProduct(productId);
    }


    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }
}
