package com.my_homeWork.lesson4;

public class Person {
    private String name;
    private String surname;
    private String gender;
    private int age;

    public Person(String surname, String gender) {
        this.surname = surname;
        this.gender = gender;
        System.out.println(surname + " " + gender);
    }

    public Person(String name, int age) {
    this.name = name;
    this.age = age;
        System.out.println(name + " is " + age + " years old");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public Person (String surname, String name, int age) {
        this (name, age);
        this.surname = surname;
    }
}
