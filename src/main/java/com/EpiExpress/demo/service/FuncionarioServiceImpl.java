package com.EpiExpress.demo.service;

import com.EpiExpress.demo.model.Funcionario;
import com.EpiExpress.demo.repository.FuncionarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioServiceImpl implements FuncionarioService{
    
    @Autowired
    private FuncionarioRepository funcionarioRepository;
       
    @Override
    public Funcionario salvaFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }
    
    @Override
    public List<Funcionario> listaFuncionario() {
        return funcionarioRepository.findAll();
    } 
    
    @Override
    public Optional<Funcionario> getByIdFuncionario(Integer codFuncionario) {
        return funcionarioRepository.findById(codFuncionario);
    }

    @Override
    public Funcionario atualizaFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    @Override
    public void deleteByIdFuncionario(Integer codFuncionario) {
        funcionarioRepository.deleteById(codFuncionario);
    }
    
}
