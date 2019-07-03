package com.stackroute.javaexercises;

public class Input {

    public  String checkGivenInput(char ch) {

        if (ch >= 'A' && ch <= 'Z')
            return ch+" is capital letter";

        else if (ch >= 'a' && ch <= 'z')
           return ch +" is small letter" ;
        else if (ch >= '0' && ch <= '9')
            return ch +" is digit";
        else
            return "Special Symbol";

    }

}
