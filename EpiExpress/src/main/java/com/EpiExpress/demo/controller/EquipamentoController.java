package com.EpiExpress.demo.controller;

import com.EpiExpress.demo.model.Equipamento;
import com.EpiExpress.demo.service.EquipamentoService;
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
public class EquipamentoController {
    
    @Autowired
    private EquipamentoService equipamentoService;
    
    @GetMapping("/equipamento")
    public ResponseEntity<List<Equipamento>> listaEquipamento(){
        return ResponseEntity.status(HttpStatus.OK).body(equipamentoService.listaEquipamentos());
    }
    
    @GetMapping("equipamento/{codequipamento}")
    public ResponseEntity<Optional<Equipamento>> getByIdEquipamento(@PathVariable Integer codequipamento){
        return ResponseEntity.status(HttpStatus.OK).body(equipamentoService.getByIdEquipamento(codequipamento));
    }

    @PostMapping("equipamento")
    public ResponseEntity<Equipamento> salvaEquipamento(@RequestBody Equipamento equipamento){
        return ResponseEntity.status(HttpStatus.CREATED).body(equipamentoService.salvaEquipamento(equipamento));
    }

    @PutMapping("equipamento")
    public ResponseEntity<Equipamento> atualizaEquipamento(@RequestBody Equipamento equipamento){
        return ResponseEntity.status(HttpStatus.OK).body(equipamentoService.atualizaEquipamento(equipamento));
    }
    
    @DeleteMapping("equipamento/{codequipamento}")
    public ResponseEntity<String> deleteByIdEquipamento(@PathVariable Integer codequipamento){
        equipamentoService.deleteByIdEquipamento(codequipamento);
        return ResponseEntity.status(HttpStatus.OK).body("Equipamento removido com sucesso");
    }
}
