package com.sistemapadaria.demo.repository;

import com.sistemapadaria.demo.model.Custumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustumerRepository extends JpaRepository<Custumer, Long> {
}
