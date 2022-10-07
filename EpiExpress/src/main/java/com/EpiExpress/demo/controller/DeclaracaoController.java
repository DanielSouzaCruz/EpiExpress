package com.EpiExpress.demo.controller;

import com.EpiExpress.demo.model.Declaracao;
import com.EpiExpress.demo.service.DeclaracaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
@Api("Api Declaracões")
public class DeclaracaoController {
    @Autowired
    private DeclaracaoService declaracaoService;

    @GetMapping("/declaracaos")
    @ApiOperation("Obter detalhes de uma Declaração")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Declaração Encontrada"),
        @ApiResponse(code = 404, message = "Declaração não Encontrada")
    })
    public ResponseEntity<List<Declaracao>> listaDeclaracaoa(){
        return ResponseEntity.status(HttpStatus.OK).body(declaracaoService.listaDeclaracao());
    }

    @GetMapping("declaracao/{coddeclaracao}")
    @ApiOperation("Procurar Declaração pelo codigo")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Declaração Encontrada"),
        @ApiResponse(code = 404, message = "Declaração não Encontrada")
    })
    public ResponseEntity<Optional<Declaracao>> getByIdDeclaracao(@PathVariable Integer coddeclaracao){
        return ResponseEntity.status(HttpStatus.OK).body(declaracaoService.getByIdDeclaracao(coddeclaracao));
    }

    @PostMapping("declaracao")
    @ApiOperation("Salvar Declaração")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Declaração Encontrada"),
        @ApiResponse(code = 404, message = "Declaração não Encontrada")
    })
    public ResponseEntity<Declaracao> salvaDeclaracao(@RequestBody Declaracao declaracao){
        return ResponseEntity.status(HttpStatus.CREATED).body(declaracaoService.salvaDeclaracao(declaracao));
    }

    @PutMapping("declaracao")
    @ApiOperation("Atualizar Declação")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Declaração Atualizada"),
        @ApiResponse(code = 404, message = "Declaração não Atualizada")
    })
    public ResponseEntity<Declaracao> atualizaDeclaracao(@RequestBody Declaracao declaracao){
        return ResponseEntity.status(HttpStatus.OK).body(declaracaoService.atualizaDeclaracao(declaracao));
    }

    @DeleteMapping("declaracao/{coddeclaracao}")
    @ApiOperation("Deletar uma Declaração")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Declaração Deletada"),
        @ApiResponse(code = 404, message = "Declaração Não Deletada")
    })
    public ResponseEntity<String> deleteByIdDeclaracao(@PathVariable Integer coddeclaracao){
        declaracaoService.deleteByIdDeclaracao(coddeclaracao);
        return ResponseEntity.status(HttpStatus.OK).body("Declaração removido com sucesso");
    }
    
}
