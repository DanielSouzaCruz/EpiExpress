package com.EpiExpress.demo.service;

import com.EpiExpress.demo.model.Declaracao;
import java.util.List;
import java.util.Optional;

public interface DeclaracaoService {
    public Declaracao salvaDeclaracao(Declaracao declaracao);

    public List<Declaracao> listaDeclaracao();

    public Optional<Declaracao> getByIdDeclaracao(Integer codDeclaracao);

    public Declaracao atualizaDeclaracao(Declaracao declaracao);

    public void deleteByIdDeclaracao(Integer codDeclaracao);
    
}
