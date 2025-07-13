package com.example.demo.services;

import com.example.demo.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProducts();
    Optional<Product> getProductById(long id);
    List<Product> getProductByName(String name);
    List<Product> getProductByPrice(int price);
    List<Product> getProductByCategory(String category);
    Product createProduct(Product product);
    void DeleteProductById(long id);
}
