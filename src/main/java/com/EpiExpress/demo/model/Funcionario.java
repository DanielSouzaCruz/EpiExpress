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
@Table(name= "funcionario")
public class Funcionario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codfuncionario")
    private Integer codFuncionario;
        
    @OneToOne
    @JoinColumn(name = "codempresa", referencedColumnName = "codempresa")
    private Empresa empresa; 
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "setor")
    private String setor;
    
    @Column(name = "funcao")
    private String funcao;

    public Funcionario() {
    }

    public Funcionario(Integer codFuncionario, String nome, String setor, String funcao) {
        this.codFuncionario = codFuncionario;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
    }

    public Funcionario(Integer codFuncionario, Empresa empresa, String nome, String setor, String funcao) {
        this.codFuncionario = codFuncionario;
        this.empresa = empresa;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
    }

    
    
    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "codFuncionario=" + codFuncionario + ", empresa=" + empresa + ", nome=" + nome + ", setor=" + setor + ", funcao=" + funcao + '}';
    }

    
    
}
