package com.EpiExpress.demo.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "empresa")
public class Empresa implements Serializable{
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codempresa")
    private Integer codEmpresa;
    
    @OneToMany
    @JoinColumn(name = "codempresa")
    private List<Funcionario> funcionarios;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "cnpj")
    private String cnpj;
    
    @Column(name = "email") 
    private String email;
    
    @Column(name = "telefone")
    private String telefone;

    public Empresa() {
    }

    public Empresa(Integer codEmpresa, String nome, String cnpj, String email, String telefone) {
        this.codEmpresa = codEmpresa;
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone = telefone;
    }

    public Empresa(Integer codEmpresa, List<Funcionario> funcionarios, String nome, String cnpj, String email, String telefone) {
        this.codEmpresa = codEmpresa;
        this.funcionarios = funcionarios;
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone = telefone;
    }
   
    public Integer getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(Integer codEmpresa) {
        this.codEmpresa = codEmpresa;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Empresa{" + "codEmpresa=" + codEmpresa + ", nome=" + nome + ", cnpj=" + cnpj + ", email=" + email + ", telefone=" + telefone + '}';
    }
    
}
