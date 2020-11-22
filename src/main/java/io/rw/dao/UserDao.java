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
        final TypedQuery<User> query = entityManager.createQuery("FROM User u WHERE u.login = :login", User.class);
        query.setParameter("login", name);
        return query.getResultList();
    }

    @Override
    public void persist(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(User user) {
        entityManager.getTransaction().begin();
        entityManager.remove(user);
        entityManager.getTransaction().commit();
    }
}
