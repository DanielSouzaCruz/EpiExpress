package com.EpiExpress.demo.controller;

import com.EpiExpress.demo.model.Emissao;
import com.EpiExpress.demo.service.EmissaoService;
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
@Api("API Emissões")
public class EmissaoController {
    
    @Autowired
    private EmissaoService emissaoService;
    
    @GetMapping("/emissaos")
    @ApiOperation("Obter detalhes de uma Emissão")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Emissão Encontrado"),
        @ApiResponse(code = 404, message = "Emissão não Encontrado")
    })
    public ResponseEntity<List<Emissao>> listaEmissao(){
        return ResponseEntity.status(HttpStatus.OK).body(emissaoService.listaEmissao());
    }
    
    @GetMapping("emissao/{codemissao}")
    @ApiOperation("Procurar uma Emissão pelo Codigo")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Emissão Encontrado"),
        @ApiResponse(code = 404, message = "Emissão não Encontrado")
    })
    public ResponseEntity<Optional<Emissao>> getByIdEmissao(@PathVariable Integer codemissao){
        return ResponseEntity.status(HttpStatus.OK).body(emissaoService.getByIdEmissao(codemissao));
    }

    @PostMapping("emissao")
    @ApiOperation("Salvar Emissão no banco de dados")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Emissão Salva"),
        @ApiResponse(code = 404, message = "Emissão não Salva")
    })
    public ResponseEntity<Emissao> salvaEmissao(@RequestBody Emissao emissao){
        return ResponseEntity.status(HttpStatus.CREATED).body(emissaoService.salvaEmissao(emissao));
    }

    @PutMapping("emissao")
    @ApiOperation("Atualizar uma Emissão")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Emissão Atualizada"),
        @ApiResponse(code = 404, message = "Falha em Atualizar a Emissão")
    })
    public ResponseEntity<Emissao> atualizaEmissao(@RequestBody Emissao emissao){
        return ResponseEntity.status(HttpStatus.OK).body(emissaoService.atualizaEmissao(emissao));
    }

    @DeleteMapping("emissao/{codemissao}")
    @ApiOperation("Deletar Emissão pelo codigo")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Emissão Deletada Com Sucesso"),
        @ApiResponse(code = 404, message = "Falha ao Deletar")
    })
    public ResponseEntity<String> deleteByIdEmissao(@PathVariable Integer codemissao){
        emissaoService.deleteByIdEmissao(codemissao);
        return ResponseEntity.status(HttpStatus.OK).body("Emissao removido com sucesso");
    }
}
