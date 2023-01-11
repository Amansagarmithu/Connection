package com.Aman.DB_Connection;

import jakarta.persistence.*;

@Entity
@Table(name = "User_db")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String name;

    public User(int user_id, String name) {
        this.user_id = user_id;
        this.name = name;
    }

    public User() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
