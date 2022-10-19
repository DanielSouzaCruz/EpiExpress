package com.EpiExpress.demo.service;

import com.EpiExpress.demo.model.Emissao;
import java.util.List;
import java.util.Optional;

public interface EmissaoService {
    
    public Emissao salvaEmissao(Emissao emissao);
    
    public List<Emissao> listaEmissao();
    
    public Optional<Emissao> getByIdEmissao(Integer codEmissao);
    
    public Emissao atualizaEmissao(Emissao emissao);
    
    public void deleteByIdEmissao(Integer codEmissao); 

}
