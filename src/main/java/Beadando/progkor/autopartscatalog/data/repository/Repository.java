package Beadando.progkor.autopartscatalog.data.repository;

import java.util.List;

public interface Repository <T,ID> {

    T save(T item);
    T getById(ID id);
    List<T> getAll();

    T update (T item);
    void deleteById(ID id);



}
