package com.sistemapadaria.demo.repository;

import com.sistemapadaria.demo.model.StockMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockMovementRepository extends JpaRepository<StockMovement, Long> {
}
