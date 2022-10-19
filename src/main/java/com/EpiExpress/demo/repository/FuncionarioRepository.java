package com.EpiExpress.demo.repository;

import com.EpiExpress.demo.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{
    
}
