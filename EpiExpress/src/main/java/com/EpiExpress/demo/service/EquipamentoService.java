package com.EpiExpress.demo.service;

import com.EpiExpress.demo.model.Equipamento;
import java.util.List;
import java.util.Optional;

public interface EquipamentoService {
    
    public Equipamento salvaEquipamento(Equipamento equipamento);
    
    public List<Equipamento> listaEquipamentos();
    
    public Optional<Equipamento> getByIdEquipamento(Integer codEquipamento);
    
    public Equipamento atualizaEquipamento(Equipamento equipamento);
    
    public void deleteByIdEquipamento(Integer codEquipamento);  
}
