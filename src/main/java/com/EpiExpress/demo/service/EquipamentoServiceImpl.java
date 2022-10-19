package com.EpiExpress.demo.service;

import com.EpiExpress.demo.model.Equipamento;
import com.EpiExpress.demo.repository.EquipamentoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipamentoServiceImpl implements EquipamentoService{
    
    @Autowired
    private EquipamentoRepository equipamentoRepository;
    
    @Override
    public Equipamento salvaEquipamento(Equipamento equipamento){
        return equipamentoRepository.save(equipamento);
        
    }
    
    @Override
    public List<Equipamento> listaEquipamentos(){
        return equipamentoRepository.findAll();
        
    }
    
    @Override
    public Optional<Equipamento> getByIdEquipamento(Integer codEquipamento){
        return equipamentoRepository.findById(codEquipamento);
    }
    
    @Override
    public Equipamento atualizaEquipamento(Equipamento equipamento){
        return equipamentoRepository.save(equipamento);
        
    }
    
    @Override
    public void deleteByIdEquipamento(Integer codEquipamento){
        equipamentoRepository.deleteById(codEquipamento);
    }
    
}
