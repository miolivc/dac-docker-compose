
package br.edu.ifpb.controller;

import br.edu.ifpb.domain.Album;
import br.edu.ifpb.domain.Estilo;
import br.edu.ifpb.persistence.Repository;
import br.edu.ifpb.qualifier.RepoAlbum;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Michelle Oliveira
 * @mail miolivc@outlook.com
 * @since 13/11/2017
 */

@Named
@SessionScoped
public class AlbumController implements Serializable {

    @Inject
    @RepoAlbum
    private Repository<Album> repository;
    private Album album;
    private String integrantesBanda;
    
    {
        this.album = new Album();
    }
    
    public String add() {
        album.getBanda().setIntegrantes(recuperaIntegrantes());
        repository.add(album);
        return null;
    }
    
    public List<Album> list() {
        return repository.get();
    }

    public List<Estilo> todosOsEstilos() {
        return Arrays.asList(Estilo.values());
    }
    
    public List<String> recuperaIntegrantes() {
        List<String> integrantes = new ArrayList<>();
        integrantes.addAll(Arrays.asList(integrantesBanda.split(",")));
        return integrantes;
    }
    
    /*
     * Getters and Setters
     */
    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getIntegrantesBanda() {
        return integrantesBanda;
    }

    public void setIntegrantesBanda(String integrantesBanda) {
        this.integrantesBanda = integrantesBanda;
    }
    
}
