package com.example.demo.services.impl;

import com.example.demo.entity.Product;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> getProductByName(String name) {
        return null;
    }

    @Override
    public List<Product> getProductByPrice(int price) {
        return null;
    }

    @Override
    public List<Product> getProductByCategory(String category) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        product.setId(null);
        return productRepository.save(product);
    }

    @Override
    public void DeleteProductById(long id) {
        // productRepository.DeleteById(id);
    }
}
