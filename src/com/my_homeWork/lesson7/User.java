package com.my_homeWork.lesson7;


import java.util.Objects;

public class User implements Comparable {
    private String name;
    private Integer age;
    private String gender;

    public User(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name) && age.equals(user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {
        User newUser = (User) o;

        if (age.intValue() > newUser.age) {
            return 1;
        } else if (age.intValue() < newUser.age) {
            return  -1;
        } else if (name.charAt(0) > newUser.name.charAt(0))
        return 1;
        return -1;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}