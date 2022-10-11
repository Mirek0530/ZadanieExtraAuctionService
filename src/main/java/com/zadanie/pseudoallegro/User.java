package com.zadanie.pseudoallegro;

public class User {
    private int userId;
    private String userName;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public int getUserId() {
        return this.userId;
    }

    @Override
    public String toString() {
        return this.userId + " " + userName;
    }
}
