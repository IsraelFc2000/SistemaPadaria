package com.sistemapadaria.demo.services;

import com.sistemapadaria.demo.NotFoundException;
import com.sistemapadaria.demo.model.Custumer;
import com.sistemapadaria.demo.repository.CustumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustumerService {

    @Autowired
    CustumerRepository custumerRepository;

    public List<Custumer> getAllCustomers() {
        return custumerRepository.findAll();
    }

    public Custumer getCustomerById(Long id) {
        return custumerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Customer not found"));
    }

    public void saveCustomer(Custumer custumer) {
        custumerRepository.save(custumer);
    }

    public void deleteCustomer(Long id) {
        custumerRepository.deleteById(id);
    }
}
