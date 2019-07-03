package com.stackroute.javaexercises;

public class ScanInteger {

    //Scans and prints the sum of unspecified scanner inputs

        public int scanUnspecifiedArgumentsOfIntegersAndPrintSum(int[] arr)
        {
            int sum=0;
            for(int i=0;i<arr.length;i++)
            {
                sum=sum+arr[i];

            }

            return sum;
        }

    }

