package io.rw.dao;

import java.util.List;

public interface Dao<T> {

    List<T> fingAll;
    T findByID(int id);
    List<T> findByName(String name);
    void persist(T t);
    void delete(T t);

}
