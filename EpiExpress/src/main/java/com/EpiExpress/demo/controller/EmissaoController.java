package com.EpiExpress.demo.controller;

import com.EpiExpress.demo.model.Emissao;
import com.EpiExpress.demo.service.EmissaoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmissaoController {
    
    @Autowired
    private EmissaoService emissaoService;
    
     @GetMapping("/emissaos")
    public ResponseEntity<List<Emissao>> listaEmissao(){
        return ResponseEntity.status(HttpStatus.OK).body(emissaoService.listaEmissao());
    }
    
    @GetMapping("emissao/{codemissao}")
    public ResponseEntity<Optional<Emissao>> getByIdEmissao(@PathVariable Integer codemissao){
        return ResponseEntity.status(HttpStatus.OK).body(emissaoService.getByIdEmissao(codemissao));
    }

    @PostMapping("emissao")
    public ResponseEntity<Emissao> salvaEmissao(@RequestBody Emissao emissao){
        return ResponseEntity.status(HttpStatus.CREATED).body(emissaoService.salvaEmissao(emissao));
    }

    @PutMapping("emissao")
    public ResponseEntity<Emissao> atualizaEmissao(@RequestBody Emissao emissao){
        return ResponseEntity.status(HttpStatus.OK).body(emissaoService.atualizaEmissao(emissao));
    }

    @DeleteMapping("emissao/{codemissao}")
    public ResponseEntity<String> deleteByIdEmissao(@PathVariable Integer codemissao){
        emissaoService.deleteByIdEmissao(codemissao);
        return ResponseEntity.status(HttpStatus.OK).body("Emissao removido com sucesso");
    }
}
