package com.EpiExpress.demo.service;

import com.EpiExpress.demo.model.Empresa;
import java.util.List;
import java.util.Optional;


public interface EmpresaService {
    
    public Empresa salvaEmpresa(Empresa empresa);
    
    public List<Empresa> listaEmpresa();
    
    public Optional<Empresa> getByIdEmpresa(Integer codEmpresa);
    
    public Empresa atualizaEmpresa(Empresa empresa);
    
    public void deleteByIdEmpresa(Integer codEmpresa); 
}
