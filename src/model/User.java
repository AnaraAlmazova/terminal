package model;

import company.Gender;

public class User {
    private int id;
    private String name;
    private int age;
    private Gender Gender;

    public User(int id, String name, int age, company.Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        Gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public company.Gender getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = company.Gender.valueOf(gender);
    }

    @Override
    public String toString() {
        return "User:  " +
                "id=" + id +
                ", name='" + name  +
                ", age=" + age +
                ", Gender=" + Gender  ;
    }
}