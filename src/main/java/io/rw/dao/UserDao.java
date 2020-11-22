package io.rw.dao;

import io.rw.model.User;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserDao implements Dao<User> {

    private EntityManager entityManager;

    public UserDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> findAll(){ return  entityManager.createQuery( "FROM User", User.class).getResultList();}

    @Override
    public User findByID(int id) {
        return entityManager.find(User.class,id);
    }

    @Override
    public List<User> findByName(String name) {
        return null;
    }

    @Override
    public void persist(User user) {

    }

    @Override
    public void delete(User user) {

    }
}
