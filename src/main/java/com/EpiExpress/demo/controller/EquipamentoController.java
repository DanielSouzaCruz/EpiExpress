package com.EpiExpress.demo.controller;

import com.EpiExpress.demo.model.Equipamento;
import com.EpiExpress.demo.service.EquipamentoService;
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
@Api("Api Equipamentos")
public class EquipamentoController {
    
    @Autowired
    private EquipamentoService equipamentoService;
    
    @GetMapping("/equipamentos")
    @ApiOperation("Obter detalhes de um Equipamento")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Equipamento Encontrado"),
        @ApiResponse(code = 404, message = "Equipamento não Encontrado")
    })
    public ResponseEntity<List<Equipamento>> listaEquipamento(){
        return ResponseEntity.status(HttpStatus.OK).body(equipamentoService.listaEquipamentos());
    }
    
    @GetMapping("equipamento/{codequipamento}")
    @ApiOperation("Procurar equipamento pelo codigo")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Equipamento Encontrado"),
        @ApiResponse(code = 404, message = "Equipamento não Encontrado")
    })
    public ResponseEntity<Optional<Equipamento>> getByIdEquipamento(@PathVariable Integer codequipamento){
        return ResponseEntity.status(HttpStatus.OK).body(equipamentoService.getByIdEquipamento(codequipamento));
    }

    @PostMapping("equipamento")
    @ApiOperation("Salvar Equipamento no Banco de Dados")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Equipamento Salvo"),
        @ApiResponse(code = 404, message = "Equipamento não Salvo")
    })
    public ResponseEntity<Equipamento> salvaEquipamento(@RequestBody Equipamento equipamento){
        return ResponseEntity.status(HttpStatus.CREATED).body(equipamentoService.salvaEquipamento(equipamento));
    }

    @PutMapping("equipamento")
    @ApiOperation("Atualizar um Equipamento")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Equipamento Atualizado"),
        @ApiResponse(code = 404, message = "Equipamento não Atualizado")
    })
    public ResponseEntity<Equipamento> atualizaEquipamento(@RequestBody Equipamento equipamento){
        return ResponseEntity.status(HttpStatus.OK).body(equipamentoService.atualizaEquipamento(equipamento));
    }
    
    @DeleteMapping("equipamento/{codequipamento}")
    @ApiOperation("Deletar Equipamento pelo Codigo")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Equipamento Deletado"),
        @ApiResponse(code = 404, message = "Equipamento não Deletado")
    })
    public ResponseEntity<String> deleteByIdEquipamento(@PathVariable Integer codequipamento){
        equipamentoService.deleteByIdEquipamento(codequipamento);
        return ResponseEntity.status(HttpStatus.OK).body("Equipamento removido com sucesso");
    }
}
