package com.codecool.september.secuirtyapp.controller;

import com.codecool.september.secuirtyapp.model.Product;
import com.codecool.september.secuirtyapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public Iterable<Product> getProducts() {
        return productService.get();
    }

    @GetMapping("/products/{id}")
    public Optional<Product> getProducts(@PathVariable long id) {
        return productService.get(id);
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product){
        return productService.create(product);
    }

    @PatchMapping("/products")
    public Product updateProduct(@RequestBody Product product){
        return productService.update(product);
    }

}
