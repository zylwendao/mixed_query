package com.my.mixed.entity;

public class User {
    private String name;
    private String address;
    private String mixedQuery;
    private int age;

    public User() {
    }

    public User(String name, String address, String mixedQuery, int age) {
        this.name = name;
        this.address = address;
        this.mixedQuery = mixedQuery;
        this.age = age;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMixedQuery() {
        return mixedQuery;
    }

    public void setMixedQuery(String mixedQuery) {
        this.mixedQuery = mixedQuery;
    }
}
