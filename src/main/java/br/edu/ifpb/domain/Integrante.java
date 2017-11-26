
package br.edu.ifpb.domain;

import java.io.Serializable;

/**
 *
 * @author Michelle Oliveira
 * @mail miolivc@outlook.com
 * @since 26/11/2017
 */

public class Integrante implements Serializable {

    private CPF cpf;
    private String nome;

    public Integrante(CPF cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
