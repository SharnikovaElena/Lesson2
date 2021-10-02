package com.my_homeWork.lesson4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //        задание 2
//        Создать класс для работы с массивами чисел. Создать методы для сортировки, нахождения максимального
//        элемента, поиска номера элемента в массиве по его значению (любое вхождение). Всю общую логику вынести в
//        приватные методы.

        int[] numbers = {8, 9, 5, 14, 19, 35, 1};
        ArrayNumbers arr = new ArrayNumbers(numbers);
        arr.maxEl();

        int index = arr.searchIndex(numbers, 1);
        System.out.println("Индекс элемента равен " + index);


//        задание 3

        USER_INFO user = USER_INFO.ANNA;
        user.returnNameSurname();

        user.changeAge();

        user.all_userInfo();

//     задание 4
//        Создать класс содержащий несколько конструкторов. Создать объект этого класса, использовав один из них. В
//        этом конструкторе сделать вызов другого конструктора этого же класса.

        Person person1 = new Person ("Sharnikova", "fem");
        Person person2 = new Person("Anna", 35);
        Person person3 = new Person("Shut", "Alina", 26);

        System.out.println(person3.toString());
    }
}


