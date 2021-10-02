package com.my_homeWork.lesson4.task1_enum;

public class Main_for_enum {
    public static void main(String[] args) {

//        задание 1
//        Переписать задачу о сезонах на enum реализацию (switch)

        MonthCheck month1 = MonthCheck.ДЕКАБРЬ;

        switch (month1) {
            case ДЕКАБРЬ:
            case ЯНВАРЬ:
            case ФЕВРАЛЬ:
                System.out.println("Это ЗИМА");
                break;
            case МАРТ:
            case АПРЕЛЬ:
            case МАЙ:
                System.out.println("Это ВЕСНА");
                break;
            case ИЮЛЬ:
            case ИЮНЬ:
            case АВГУСТ:
                System.out.println("Это ЛЕТО");
                break;
            case СЕНТЯБРЬ:
            case ОКТЯБРЬ:
            case НОЯБРЬ:
                System.out.println("Это ОСЕНЬ");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}

