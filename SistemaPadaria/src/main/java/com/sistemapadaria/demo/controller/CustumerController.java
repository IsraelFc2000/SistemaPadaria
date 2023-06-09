package com.sistemapadaria.demo.controller;

import com.sistemapadaria.demo.model.Custumer;
import com.sistemapadaria.demo.services.CustumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/custumer")
public class CustumerController {

    @Autowired
    CustumerService custumerService;

    @GetMapping
    public List<Custumer> getAllCustomers() {
        return custumerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Custumer getCustomerById(@PathVariable Long id) {
        return custumerService.getCustomerById(id);
    }

    @PostMapping
    public void saveCustomer(@RequestBody Custumer custumer) {
        custumerService.saveCustomer(custumer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        custumerService.deleteCustomer(id);
    }
}
