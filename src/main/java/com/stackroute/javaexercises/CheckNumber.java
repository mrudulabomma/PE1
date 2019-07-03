package com.stackroute.javaexercises;

public class CheckNumber {

      public String check(int x) {
        if (x % 2 != 0 && x >= 20 && x <= 30) {

           return "Tom";
        } else if (x % 2 == 0 && x >= 20 && x <= 30) {
            return "Jerry";
        } else {
            return"number is not correct";

        }
    }
}
