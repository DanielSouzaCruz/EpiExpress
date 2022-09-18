package com.EpiExpress.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "emissao")
public class Emissao implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codemissao")
    private Integer codEmissao;
        
    @OneToOne
    @JoinColumn(name = "codusuario", referencedColumnName = "codusuario")
    private Usuario usuario; 
    
    @OneToOne
    @JoinColumn(name = "coddeclaracao", referencedColumnName = "coddeclaracao")
    private Declaracao declaracao;
    
    @OneToOne
    @JoinColumn(name = "codfuncionario", referencedColumnName = "codfuncionario")
    private Funcionario funcionario; 
    
    @OneToOne
    @JoinColumn(name = "codemissaoequipamento")
    private EmissaoEquipamento emissaoEquipamentos;

    public Emissao() {
    }

    public Emissao(Integer codEmissao, Usuario usuario, Declaracao declaracao, Funcionario funcionario, EmissaoEquipamento emissaoEquipamentos) {
        this.codEmissao = codEmissao;
        this.usuario = usuario;
        this.declaracao = declaracao;
        this.funcionario = funcionario;
        this.emissaoEquipamentos = emissaoEquipamentos;
    }

    public Integer getCodEmissao() {
        return codEmissao;
    }

    public void setCodEmissao(Integer codEmissao) {
        this.codEmissao = codEmissao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Declaracao getDeclaracao() {
        return declaracao;
    }

    public void setDeclaracao(Declaracao declaracao) {
        this.declaracao = declaracao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public EmissaoEquipamento getEmissaoEquipamentos() {
        return emissaoEquipamentos;
    }

    public void setEmissaoEquipamentos(EmissaoEquipamento emissaoEquipamentos) {
        this.emissaoEquipamentos = emissaoEquipamentos;
    }

    @Override
    public String toString() {
        return "Emissao{" + "codEmissao=" + codEmissao + ", usuario=" + usuario + ", declaracao=" + declaracao + ", funcionario=" + funcionario + ", emissaoEquipamentos=" + emissaoEquipamentos + '}';
    }
}
