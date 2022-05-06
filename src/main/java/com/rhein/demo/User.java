package com.rhein.demo;

public class User {

    private String username;
    private int age;

    public User() {
        this.username = null;
        this.age = 0;
        System.out.println("User construct function is called.");
    }

    public User(String username, int age) {
        this.username = username;
        this.age = age;
        System.out.println("User construct function with params is called.");
    }


    public String getUsername() {
        System.out.println("User getUsername function is called.");
        return this.username;
    }

    public void setUsername(String username) {
        System.out.println("User setUsername function is called.");
        this.username = username;
    }

    public int getAge() {
        System.out.println("User getAge function is called.");
        return this.age;
    }

    public void setAge(int age) {
        System.out.println("User setAge function is called.");
        this.age = age;
    }
}
