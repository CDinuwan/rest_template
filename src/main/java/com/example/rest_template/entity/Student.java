package com.example.rest_template.entity;

public class Student {

    private int roll;
    private String name;
    private String city;

    public Student(int roll, String name, String city) {
        super();
        this.roll = roll;
        this.name = name;
        this.city = city;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
