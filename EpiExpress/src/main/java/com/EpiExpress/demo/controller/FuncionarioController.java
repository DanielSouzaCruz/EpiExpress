package com.EpiExpress.demo.controller;

import com.EpiExpress.demo.model.Funcionario;
import com.EpiExpress.demo.service.FuncionarioService;
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
public class FuncionarioController {
    
    @Autowired
    private FuncionarioService funcionarioService;
    
    @GetMapping("/funcionario")
    public ResponseEntity<List<Funcionario>> listaFuncionario(){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.listaFuncionario());
    }
    
    @GetMapping("funcionario/{codfuncionario}")
    public ResponseEntity<Optional<Funcionario>> getByIdFuncionario(@PathVariable Integer codfuncionario){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.getByIdFuncionario(codfuncionario));
    }

    @PostMapping("funcionario")
    public ResponseEntity<Funcionario> salvaFuncionario(@RequestBody Funcionario funcionario){
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioService.salvaFuncionario(funcionario));
    }

    @PutMapping("funcionario")
    public ResponseEntity<Funcionario> atualizaFuncionario(@RequestBody Funcionario funcionario){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.atualizaFuncionario(funcionario));
    }

    @DeleteMapping("funcionario/{codfuncionario}")
    public ResponseEntity<String> deleteByIdFuncionario(@PathVariable Integer codfuncionario){
        funcionarioService.deleteByIdFuncionario(codfuncionario);
        return ResponseEntity.status(HttpStatus.OK).body("Funcionario removido com sucesso");
    }
    
}
