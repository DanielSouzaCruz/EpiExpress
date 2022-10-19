package com.EpiExpress.demo.service;

import com.EpiExpress.demo.model.Empresa;
import com.EpiExpress.demo.repository.EmpresaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImpl implements EmpresaService {
    
    @Autowired
    private EmpresaRepository empresaRepository;
       
    @Override
    public Empresa salvaEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }
    
    @Override
    public List<Empresa> listaEmpresa() {
        return empresaRepository.findAll();
    } 
    
    @Override
    public Optional<Empresa> getByIdEmpresa(Integer codEmpresa) {
        return empresaRepository.findById(codEmpresa);
    }

    @Override
    public Empresa atualizaEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @Override
    public void deleteByIdEmpresa(Integer codEmpresa) {
        empresaRepository.deleteById(codEmpresa);
    }
    
}
