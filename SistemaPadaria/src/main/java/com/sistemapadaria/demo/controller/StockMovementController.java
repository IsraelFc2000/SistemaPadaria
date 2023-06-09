package com.sistemapadaria.demo.controller;

import com.sistemapadaria.demo.model.StockMovement;
import com.sistemapadaria.demo.services.StockMovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stock-movement")
public class StockMovementController {

    @Autowired
    StockMovementService stockMovementService;

    @GetMapping
    public List<StockMovement> getAllStockMovements() {
        return stockMovementService.getAllStockMovements();
    }

    @GetMapping("/{id}")
    public StockMovement getStockMovementById(@PathVariable Long id) {
        return stockMovementService.getStockMovementById(id);
    }

    @PostMapping
    public void saveStockMovement(@RequestBody StockMovement stockMovement) {
        stockMovementService.saveStockMovement(stockMovement);
    }

    @DeleteMapping("/{id}")
    public void deleteStockMovement(@PathVariable Long id) {
        stockMovementService.deleteStockMovement(id);
    }
}
