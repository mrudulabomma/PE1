package com.stackroute.javaexercises;

public class Loop {

    public static String printLoop(int num) {

        String result="";
        Integer.parseInt(String.valueOf(num));
        for(int i=1;i<=num;i++)
        {
            for(int j=0;j<i;j++)
            {
                result=result+i;
            }
        }
        return result;
    }
}
