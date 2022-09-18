package com.EpiExpress.demo.controller;

import com.EpiExpress.demo.model.Declaracao;
import com.EpiExpress.demo.service.DeclaracaoService;
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
public class DeclaracaoController {
    @Autowired
    private DeclaracaoService declaracaoService;

    @GetMapping("/declaracaos")
    public ResponseEntity<List<Declaracao>> listaDeclaracaoa(){
        return ResponseEntity.status(HttpStatus.OK).body(declaracaoService.listaDeclaracao());
    }

    @GetMapping("declaracao/{coddeclaracao}")
    public ResponseEntity<Optional<Declaracao>> getByIdDeclaracao(@PathVariable Integer coddeclaracao){
        return ResponseEntity.status(HttpStatus.OK).body(declaracaoService.getByIdDeclaracao(coddeclaracao));
    }

    @PostMapping("declaracao")
    public ResponseEntity<Declaracao> salvaDeclaracao(@RequestBody Declaracao declaracao){
        return ResponseEntity.status(HttpStatus.CREATED).body(declaracaoService.salvaDeclaracao(declaracao));
    }

    @PutMapping("declaracao")
    public ResponseEntity<Declaracao> atualizaDeclaracao(@RequestBody Declaracao declaracao){
        return ResponseEntity.status(HttpStatus.OK).body(declaracaoService.atualizaDeclaracao(declaracao));
    }

    @DeleteMapping("declaracao/{coddeclaracao}")
    public ResponseEntity<String> deleteByIdDeclaracao(@PathVariable Integer coddeclaracao){
        declaracaoService.deleteByIdDeclaracao(coddeclaracao);
        return ResponseEntity.status(HttpStatus.OK).body("Declaração removido com sucesso");
    }
    
}
