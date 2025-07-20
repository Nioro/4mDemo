package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "products", schema = "test")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "c_name", nullable = false, unique = false)
    String name;
    @Column(name = "c_category", nullable = false)
    String category;
    @Column(name = "c_price", nullable = false)
    Integer price;
}
