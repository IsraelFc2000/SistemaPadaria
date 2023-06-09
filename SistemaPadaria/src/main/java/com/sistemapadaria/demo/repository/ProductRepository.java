package com.sistemapadaria.demo.repository;

import com.sistemapadaria.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
