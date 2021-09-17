package com.my_homeWork.lesson3;

import java.util.Arrays;

public class Fibbonacci {
    public void task1 () {
        int[] fib = new  int[11];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i-2];
        }
        System.out.println(Arrays.toString(fib));
    }
}
