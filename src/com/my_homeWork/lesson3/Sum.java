package com.my_homeWork.lesson3;

import java.util.Arrays;

public class Sum {

    public void task2 () {
        int [] MinMax = {9, 5, 10, 2, 14,20, -2};
               for (int j = 0; j < MinMax.length; j++){
                   for (int i = 0; i < MinMax.length -1 - j; i++) {
                       int max = MinMax[i];
                       if (max > MinMax[i+1]){
                           MinMax[i] = MinMax [i+1];
                           MinMax[i+1] = max;
                       }
                   }
               }
//        Arrays.sort(MinMax);
        int Sum = MinMax[0] + MinMax[MinMax.length -1];
        System.out.println(Sum);
    }
}
