package com.EpiExpress.demo.controller;

import com.EpiExpress.demo.model.Funcionario;
import com.EpiExpress.demo.service.FuncionarioService;
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
@Api("API Funcionarios")
public class FuncionarioController {
    
    @Autowired
    private FuncionarioService funcionarioService;
    
    @GetMapping("/funcionarios")
    @ApiOperation("Obter detalhes de uma Funcionario")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Funcionario Encontrado"),
        @ApiResponse(code = 404, message = "Funcionario não Encontrado")
    })
    public ResponseEntity<List<Funcionario>> listaFuncionario(){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.listaFuncionario());
    }
    
    @GetMapping("funcionario/{codfuncionario}")
    @ApiOperation("Procurar uma Funcionario pelo Codigo")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Funcionario encontrado"),
        @ApiResponse(code = 404, message = "Funcionario não encontrado")
    })
    public ResponseEntity<Optional<Funcionario>> getByIdFuncionario(@PathVariable Integer codfuncionario){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.getByIdFuncionario(codfuncionario));
    }

    @PostMapping("funcionario")
    @ApiOperation("Salvar Funcionario no banco de dados")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Funcionario Salva"),
        @ApiResponse(code = 404, message = "Funcionario não Salva")
    })
    public ResponseEntity<Funcionario> salvaFuncionario(@RequestBody Funcionario funcionario){
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioService.salvaFuncionario(funcionario));
    }

    @PutMapping("funcionario")
    @ApiOperation("Atualizar um Funcionario")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Funcionario Atualizado"),
        @ApiResponse(code = 404, message = "Falha em Atualizar o Funcionario")
    })
    public ResponseEntity<Funcionario> atualizaFuncionario(@RequestBody Funcionario funcionario){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.atualizaFuncionario(funcionario));
    }

    @DeleteMapping("funcionario/{codfuncionario}")
    @ApiOperation("Deletar Funcionario pelo codigo")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Funcionario Deletado Com Sucesso"),
        @ApiResponse(code = 404, message = "Falha ao Deletar")
    })
    public ResponseEntity<String> deleteByIdFuncionario(@PathVariable Integer codfuncionario){
        funcionarioService.deleteByIdFuncionario(codfuncionario);
        return ResponseEntity.status(HttpStatus.OK).body("Funcionario removido com sucesso");
    }
    
}
