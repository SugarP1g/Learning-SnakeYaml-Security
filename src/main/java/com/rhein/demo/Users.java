package com.rhein.demo;

public class Users {

    private User user1;

    public Users() {
        // this.user1 = null;
        System.out.println("Users construct function is called.");
    }

    public Users(User user1) {
        this.user1 = user1;
        System.out.println("Users construct function with params is called.");
    }

    public void setUser(User user) {
        this.user1 = user;
        System.out.println("Users setUser function with params is called.");
    }

    public User getUser() {
        System.out.println("Users getUser function with params is called.");
        return this.user1;
    }
}
