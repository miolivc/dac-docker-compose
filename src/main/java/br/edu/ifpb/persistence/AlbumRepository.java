
package br.edu.ifpb.persistence;

import br.edu.ifpb.domain.Album;
import br.edu.ifpb.qualifier.RepoAlbum;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author Michelle Oliveira
 * @mail miolivc@outlook.com
 * @since 13/11/2017
 */


@RepoAlbum
public class AlbumRepository implements Repository<Album>, Serializable {

    @PersistenceContext
    private EntityManager manager;
    
    @Override
    @Transactional
    public void add(Album album) {
        manager.persist(album);
    }
    
    @Override
    public void update(Album album) {
        manager.merge(album);
    }
    
    @Override
    public List<Album> get() {
        return manager.createQuery("FROM Album a").getResultList();
    }
    
    @Override
    public Album get(int id) {
        return manager.find(Album.class, id);
    }
    
}
