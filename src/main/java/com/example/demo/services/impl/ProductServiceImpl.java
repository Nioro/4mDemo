package com.example.demo.services.impl;

import com.example.demo.entity.Product;
import com.example.demo.repositories.InMemoryProductRepository;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final InMemoryProductRepository inMemoryProductRepository;

    public ProductServiceImpl(InMemoryProductRepository inMemoryProductRepository) {
        this.inMemoryProductRepository = inMemoryProductRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return inMemoryProductRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(long id) {
        return inMemoryProductRepository.findById(id);
    }

    @Override
    public List<Product> getProductByName(String name) {
        return inMemoryProductRepository.findByName(name);
    }

    @Override
    public List<Product> getProductByPrice(int price) {
        return inMemoryProductRepository.findByPrice(price);
    }

    @Override
    public List<Product> getProductByCategory(String category) {
        return inMemoryProductRepository.findByCategory(category);
    }

    @Override
    public Product createProduct(Product product) {
        return inMemoryProductRepository.save(product);
    }

    @Override
    public void DeleteProductById(long id) {
        inMemoryProductRepository.DeleteById(id);
    }
}
