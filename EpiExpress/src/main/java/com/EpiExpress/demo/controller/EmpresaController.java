package com.EpiExpress.demo.controller;

import com.EpiExpress.demo.model.Empresa;
import com.EpiExpress.demo.service.EmpresaService;
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
@Api("Api Empresas")
public class EmpresaController {
    
    @Autowired
    private EmpresaService empresaService;
    
     @GetMapping("/empresas")
    public ResponseEntity<List<Empresa>> listaEmpresa(){
        return ResponseEntity.status(HttpStatus.OK).body(empresaService.listaEmpresa());
    }
    
    @GetMapping("empresa/{codempresa}")
    @ApiOperation("Obter detalhes de uma Empresa")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Empresa encontrado"),
        @ApiResponse(code = 404, message = "Empresa não encontrado")
    })
    public ResponseEntity<Optional<Empresa>> getByIdEmpresa(@PathVariable Integer codempresa){
        return ResponseEntity.status(HttpStatus.OK).body(empresaService.getByIdEmpresa(codempresa));
    }

    @PostMapping("empresa")
    public ResponseEntity<Empresa> salvaEmpresa(@RequestBody Empresa empresa){
        return ResponseEntity.status(HttpStatus.CREATED).body(empresaService.salvaEmpresa(empresa));
    }

    @PutMapping("empresa")
    public ResponseEntity<Empresa> atualizaEmpresa(@RequestBody Empresa empresa){
        return ResponseEntity.status(HttpStatus.OK).body(empresaService.atualizaEmpresa(empresa));
    }

    @DeleteMapping("empresa/{codempresa}")
    public ResponseEntity<String> deleteByIdEmpresa(@PathVariable Integer codempresa){
        empresaService.deleteByIdEmpresa(codempresa);
        return ResponseEntity.status(HttpStatus.OK).body("Empresa removido com sucesso");
    } 
}
