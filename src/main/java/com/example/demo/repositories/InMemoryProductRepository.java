package com.example.demo.repositories;

import com.example.demo.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InMemoryProductRepository {
    List<Product> findAll();
    Optional<Product> findById(long id);
    List<Product> findByName(String name);
    List<Product> findByPrice(int price);
    List<Product> findByCategory(String category);
    Product save(Product product);
    void DeleteById(long id);
}
