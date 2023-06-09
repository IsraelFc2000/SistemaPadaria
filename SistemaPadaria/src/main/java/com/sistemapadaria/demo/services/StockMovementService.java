package com.sistemapadaria.demo.services;

import com.sistemapadaria.demo.NotFoundException;
import com.sistemapadaria.demo.model.StockMovement;
import com.sistemapadaria.demo.repository.StockMovementRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockMovementService {

    @Autowired
    StockMovementRepository stockMovementRepository;

    public List<StockMovement> getAllStockMovements() {
        return stockMovementRepository.findAll();
    }

    public StockMovement getStockMovementById(Long id) {
        return stockMovementRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Stock movement not found" + id));
    }

    public void saveStockMovement(StockMovement stockMovement) {
        stockMovementRepository.save(stockMovement);
    }

    public void deleteStockMovement(Long id) {
        stockMovementRepository.deleteById(id);
    }
}
