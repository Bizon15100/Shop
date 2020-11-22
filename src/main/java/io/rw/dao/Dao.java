package io.rw.dao;

import io.rw.model.User;

import java.util.List;

public interface Dao<T> {

    List<T> findAll();
    T findByID(int id);
    List<T> findByName(String name);
    void persist(T t);
    void delete(T t);

}
