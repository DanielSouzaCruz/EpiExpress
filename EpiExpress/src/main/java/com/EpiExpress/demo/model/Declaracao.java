
package com.EpiExpress.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "declaracao")
public class Declaracao implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coddeclaracao")
    private Integer codDeclaracao;

    @Column(name = "declaracao")
    private String declaracao;

    public Declaracao() {
    }

    public Declaracao(Integer codDeclaracao, String declaracao) {
        this.codDeclaracao = codDeclaracao;
        this.declaracao = declaracao;
    }

    public Integer getCodDeclaracao() {
        return codDeclaracao;
    }

    public void setCodDeclaracao(Integer codDeclaracao) {
        this.codDeclaracao = codDeclaracao;
    }

    public String getDeclaracao() {
        return declaracao;
    }

    public void setDeclaracao(String declaracao) {
        this.declaracao = declaracao;
    }

    @Override
    public String toString() {
        return "Declaracao{" + "codDeclaracao=" + codDeclaracao + ", declaracao=" + declaracao + '}';
    }
    
}
