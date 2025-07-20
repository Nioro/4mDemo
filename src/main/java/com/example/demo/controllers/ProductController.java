package com.example.demo.controllers;

import com.example.demo.entity.Product;
import com.example.demo.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/products")
@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllUsers(){
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable long id){
        return productService.getProductById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound()
                        .build());
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@PathVariable Product product){
        return ResponseEntity.ok(productService.createProduct(product));
    }
}
