package com.EpiExpress.demo.repository;

import com.EpiExpress.demo.model.Emissao;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmissaoRepository extends JpaRepository<Emissao, Integer>{
    
}
