package com.stackroute.javaexercises;
import java.util.*;
public class Guess {

    public String guessTheTargetNumber(int target_num, int[] arr) {
        int number;
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 1-50");
        while(true)
        {
            number= arr[i];
            if(i<arr.length) {
                if (number > target_num)
                    System.out.println("Number guessed is more then original number");
                else if (number < target_num)
                    System.out.println("Number guessed is less than original number");
                else {
                    return "Number guessed matches the original number";
                }
                i++;
            }
            else {
                return "Number guessed is not correct";
            }
        }
    }
}
