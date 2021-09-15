package com.my_homeWork;

import java.util.Scanner;

public class Month {
    public void CheckMonth() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
//    System.out.println(str);

        switch (str) {
            case "декабрь":
            case "январь":
            case "февраль":
                System.out.println("Пора года - зима");
                break;
            case "март":
            case "апрель":
            case "май":
                System.out.println("Пора года - весна");
                break;
            case "июнь":
            case "июль":
            case "август":
                System.out.println("Пора года - лето");
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                System.out.println("Пора года  - осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
