package com.EpiExpress.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "usuario")
public class Usuario implements Serializable{
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codusuario")
    private Integer codUsuario;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "nivel")
    private String nivel;
    
    @Column(name = "senha")
    private String senha;

    public Usuario() {
    }

    public Usuario(Integer codUsuario, String nome, String nivel, String senha) {
        this.codUsuario = codUsuario;
        this.nome = nome;
        this.nivel = nivel;
        this.senha = senha;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codUsuario=" + codUsuario + ", nome=" + nome + ", nivel=" + nivel + ", senha=" + senha + '}';
    }
}
