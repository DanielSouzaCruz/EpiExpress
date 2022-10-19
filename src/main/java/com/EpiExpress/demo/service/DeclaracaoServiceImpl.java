package com.EpiExpress.demo.service;

import com.EpiExpress.demo.model.Declaracao;
import com.EpiExpress.demo.repository.DeclaracaoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeclaracaoServiceImpl implements DeclaracaoService{
    @Autowired
    private DeclaracaoRepository declaracaoRepository;

    @Override
    public Declaracao salvaDeclaracao(Declaracao declaracao) {
        return declaracaoRepository.save(declaracao);
    }

    @Override
    public List<Declaracao> listaDeclaracao() {
        return declaracaoRepository.findAll();
    } 

    @Override
    public Optional<Declaracao> getByIdDeclaracao(Integer codDeclaracao) {
        return declaracaoRepository.findById(codDeclaracao);
    }

    @Override
    public Declaracao atualizaDeclaracao(Declaracao declaracao) {
        return declaracaoRepository.save(declaracao);
    }

    @Override
    public void deleteByIdDeclaracao(Integer codDeclaracao) {
        declaracaoRepository.deleteById(codDeclaracao);
    }

    
}
