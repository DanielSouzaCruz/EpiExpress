package com.EpiExpress.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipamento")
public class Equipamento implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codequipamento")
    private Integer codEquipamento;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "ca")
    private String ca;
    
    @Column(name = "quantidade")
    private Integer quantidade;

    public Equipamento() {
    }

    public Equipamento(Integer codEquipamento, String nome, String ca, Integer quantidade) {
        this.codEquipamento = codEquipamento;
        this.nome = nome;
        this.ca = ca;
        this.quantidade = quantidade;
    }

    public Integer getCodEquipamento() {
        return codEquipamento;
    }

    public void setCodEquipamento(Integer codEquipamento) {
        this.codEquipamento = codEquipamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Equipamento{" + "codEquipamento=" + codEquipamento + ", nome=" + nome + ", ca=" + ca + ", quantidade=" + quantidade + '}';
    }
    
}
