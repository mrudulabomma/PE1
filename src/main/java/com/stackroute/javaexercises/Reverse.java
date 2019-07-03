package com.stackroute.javaexercises;

public class Reverse {

    public String reverse(String word) {
        String rev="";
       int length=word.length();
       for(int i=length-1;i>=0;i--){
           char c=word.charAt(i);
           rev=rev.concat(Character.toString(c));
       }
       return rev;

    }

}
