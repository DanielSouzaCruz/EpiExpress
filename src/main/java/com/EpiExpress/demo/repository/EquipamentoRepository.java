package com.EpiExpress.demo.repository;

import com.EpiExpress.demo.model.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Integer>{
    
}
