
package com.EpiExpress.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emissaoequipamento")
public class EmissaoEquipamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codemissaoequipamento")
    private Integer codEmissaoEquipamento;

    @ManyToOne
    @JoinColumn(name = "codequipamento")
    private Equipamento equipamentos;

    public EmissaoEquipamento() {
    }

    public EmissaoEquipamento(Integer codEmissaoEquipamento) {
        this.codEmissaoEquipamento = codEmissaoEquipamento;
    }

    public EmissaoEquipamento(Integer codEmissaoEquipamento, Equipamento equipamentos) {
        this.codEmissaoEquipamento = codEmissaoEquipamento;
        this.equipamentos = equipamentos;
    }

    public Integer getCodEmissaoEquipamento() {
        return codEmissaoEquipamento;
    }

    public void setCodEmissaoEquipamento(Integer codEmissaoEquipamento) {
        this.codEmissaoEquipamento = codEmissaoEquipamento;
    }

    public Equipamento getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(Equipamento equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "EmissaoEquipamento{" + "codEmissaoEquipamento=" + codEmissaoEquipamento + ", equipamentos=" + equipamentos + '}';
    }
    
    
    
}
