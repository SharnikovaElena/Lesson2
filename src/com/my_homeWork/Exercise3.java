package com.my_homeWork;

import java.util.Scanner;

public class Exercise3 {
    public void checkText() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        while (!scanner.nextLine().equals("exit")) {
            System.out.println(text);
            System.out.println("Введите следующее слово");
        }
        scanner.close();
//        System.out.println("Exit!");

        }
    }

