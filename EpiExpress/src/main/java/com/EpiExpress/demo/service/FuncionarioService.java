
package com.EpiExpress.demo.service;

import com.EpiExpress.demo.model.Funcionario;
import java.util.List;
import java.util.Optional;


public interface FuncionarioService {
    public Funcionario salvaFuncionario(Funcionario empresa);
    
    public List<Funcionario> listaFuncionario();
    
    public Optional<Funcionario> getByIdFuncionario(Integer codFuncionario);
    
    public Funcionario atualizaFuncionario(Funcionario funcionario);
    
    public void deleteByIdFuncionario(Integer codFuncionario); 
}
