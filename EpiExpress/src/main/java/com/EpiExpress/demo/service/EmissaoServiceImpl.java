package com.EpiExpress.demo.service;

import com.EpiExpress.demo.model.Emissao;
import com.EpiExpress.demo.repository.EmissaoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmissaoServiceImpl implements EmissaoService{
    
    @Autowired
    private EmissaoRepository emissaoRepository;
       
    @Override
    public Emissao salvaEmissao(Emissao emissao) {
        return emissaoRepository.save(emissao);
    }
    
    @Override
    public List<Emissao> listaEmissao() {
        return emissaoRepository.findAll();
    } 
    
    @Override
    public Optional<Emissao> getByIdEmissao(Integer codEmissao) {
        return emissaoRepository.findById(codEmissao);
    }

    @Override
    public Emissao atualizaEmissao(Emissao emissao) {
        return emissaoRepository.save(emissao);
    }

    @Override
    public void deleteByIdEmissao(Integer codEmissao) {
        emissaoRepository.deleteById(codEmissao);
    }
}
