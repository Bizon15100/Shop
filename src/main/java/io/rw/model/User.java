package io.rw.model;

import io.rw.util.Hash;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String login;
    private String password;
    private String email;
    @OneToOne
    private Cart cart;


    public User(String login, String password, String email) {
        this.login = login;
        this.password = new Hash(password).sha512();
        this.email = email;
    }

    public User() {
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", cart=" + cart +
                '}';
    }
}
