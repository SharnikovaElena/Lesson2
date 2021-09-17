package com.my_homeWork.lesson3;

public class Difference_sum {
    public void numbers(){
        int [] numb = {8, 9, 15, 17,20,45};
        int even_sum = 0;
        int odd_sum = 0;

        for (int i =0; i < numb.length; i++){

            if (numb [i] % 2 == 0){
            even_sum = even_sum + numb [i];
            } else {
                odd_sum = odd_sum +numb[i];
            }
        }
        if (odd_sum > even_sum) {
            System.out.print("Разница между суммой четных и нечетных элементов: " + (odd_sum - even_sum));
        } else {
            System.out.println("Разница между суммой четных и нечетных элементов: " + (even_sum - odd_sum));
        }
    }
}
