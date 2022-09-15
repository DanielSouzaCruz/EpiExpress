package com.EpiExpress.demo.repository;

import com.EpiExpress.demo.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
    
}
