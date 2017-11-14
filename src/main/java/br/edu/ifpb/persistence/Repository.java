
package br.edu.ifpb.persistence;

import java.util.List;

/**
 *
 * @author Michelle Oliveira
 * @param <T>
 * @mail miolivc@outlook.com
 * @since 13/11/2017
 */
public interface Repository<T> {

    void add(T t);
    List<T> get();
    T get(int id);
    void update(T t);

}
