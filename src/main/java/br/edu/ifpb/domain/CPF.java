
package br.edu.ifpb.domain;

/**
 *
 * @author Michelle Oliveira
 * @mail miolivc@outlook.com
 * @since 26/11/2017
 */

public class CPF {
    
    private final String valor;

    public CPF(String cpf) {
        this.valor = cpf;
    }
    
    public String getValor() {
        return valor;
    }
    
}
