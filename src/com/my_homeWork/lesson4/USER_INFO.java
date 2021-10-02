package com.my_homeWork.lesson4;

public enum USER_INFO {
    ANNA ("Anna", "Popova", "female", 6),
    SERGEY ("Sergey", "Popov", "male", 36),
    POLINA ("Polina", "Belyaeva", "female", 20),
    PAVEL ("Pavel", "Belyaev", "male", 25);

    private String name;
    private String surname;
    private String gender;
    private int age;

    USER_INFO(String name, String surname, String gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

   public void returnNameSurname () {
       System.out.println("User is " + name + " " + surname);
   }

   public void changeAge () {
       age = age + 5;
       System.out.println("Age is " + age);
   }

   public void all_userInfo () {
       System.out.println("User is " + name + " " + surname + " " + gender + " " + age);
   }
     }

