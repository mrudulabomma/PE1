package com.stackroute.javaexercises;

public class CheckLetter {

    public static String check(String word) {
        int len=word.length();
        String str="";
        for(int i=0;i<len;i++)
        {
            char ch = word.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')

                str=str.concat("vowel");

            else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                str=str.concat("consonent");
            else
                str=str.concat("digits");
        }
return str;

    }
}
