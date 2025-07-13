package com.example.demo.repositories.impl;

import com.example.demo.entity.Product;
import com.example.demo.repositories.InMemoryProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class InMemoryProductRepositoryImpl implements InMemoryProductRepository {
    List<Product> products = new ArrayList<>();
    long id = 1L;
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Optional<Product> findById(long id) {
        return products.stream().filter(product -> product.getId().equals(id)).findFirst();
    }

    @Override
    public List<Product> findByName(String name) {
        return products.stream().filter(product -> product.getName().equals(name)).toList();
    }

    @Override
    public List<Product> findByPrice(int price) {
        return products.stream().filter(product -> product.getName().equals(price)).toList();
    }

    @Override
    public List<Product> findByCategory(String category) {
        return products.stream().filter(product -> product.getName().equals(category)).toList();
    }

    @Override
    public Product save(Product product) {
        if(product.getId() == null){
            product.setId(id++);
        }
        else{
            products.removeIf(product1 -> product1.getId().equals(product.getId()));
        }
        products.add(product);
        return product;
    }

    @Override
    public void DeleteById(long id) {
        products.removeIf(product -> product.getId().equals(id));
    }
}
