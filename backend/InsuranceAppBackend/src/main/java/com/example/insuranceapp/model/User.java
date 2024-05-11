package com.example.insuranceapp.model;

public class User {
    private String name;
    private int age;
    private boolean smoker;

    // Constructor
    public User() {}

    public User(String name, int age, boolean smoker) {
        this.name = name;
        this.age = age;
        this.smoker = smoker;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSmoker() {
        return smoker;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }
}
