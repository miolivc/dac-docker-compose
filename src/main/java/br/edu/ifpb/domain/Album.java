
package br.edu.ifpb.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Michelle Oliveira
 * @mail miolivc@outlook.com
 * @since 13/11/2017
 */

@Entity
@SequenceGenerator(name = "album_seq",  sequenceName = "album_seq")
public class Album implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "album_seq")
    private int id;
    
    private String nome;
    
    @Enumerated(EnumType.STRING)
    private Estilo estilo;
    
    @OneToMany
    @ElementCollection
    private Banda banda;

    private LocalDate lancamento;

    public Album() {
    }

    private Album(String nome, Estilo estilo, Banda banda, LocalDate lancamento) {
        this.nome = nome;
        this.estilo = estilo;
        this.banda = banda;
        this.lancamento = lancamento;
    }
    
    public static Album of(String nome, Estilo estilo, Banda banda, LocalDate lancamento) {
        return new Album(nome, estilo, banda, lancamento);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public Estilo getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
