package com.my_homeWork.lesson4;

import java.util.Arrays;

public class ArrayNumbers {

    private int[] numbers;

    public ArrayNumbers(int[] numbers) {
        this.numbers = numbers;
    }


    public void sort() {
        Arrays.sort(numbers);
    }


    public void maxEl() {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        System.out.println("Максимальный элемент массива равен " + max);

    }

// если массив отсорстирован, то поиск максимального знанчения элемента:
//    public void maxEl2() {
//        int max2 = numbers[numbers.length - 1];
//        System.out.println("Максимальный элемент равен " + max2);
//    }


    public int searchIndex(int[] numbers, int value) {
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                k = i;
                break;
            }
        }
        return k;
    }
}
