
package br.edu.ifpb.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Michelle Oliveira
 * @mail miolivc@outlook.com
 * @since 13/11/2017
 */

@Entity
@SequenceGenerator(name = "banda_seq", sequenceName = "banda_seq")
public class Banda implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "banda_seq")
    private int id;
    private String nome;
    private String origem;
    @ElementCollection
    private List<String> integrantes; 

    {
        this.integrantes = new ArrayList<>();
    }

    public Banda() {
    }
    
    private Banda(String nome, String origem) {
        this.nome = nome;
        this.origem = origem;
    }
    
    public static Banda of(String nome, String origem) {
        return new Banda(nome, origem);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public List<String> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<String> integrantes) {
        this.integrantes = integrantes;
    }
    
    
    
}
