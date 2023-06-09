package com.sistemapadaria.demo.repository;

import com.sistemapadaria.demo.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
