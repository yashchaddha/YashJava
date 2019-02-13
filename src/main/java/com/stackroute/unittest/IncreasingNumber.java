/*
Write a program which accepts a number as input from user and perform the following:
a. sort the number in non-increasing order
b. after sorting sum all the even numbers, the sum should be greater than 15 .
c. if sum is more than 15,then print output as true or false.

Input  : 234534
Output : Sorted number in non-increasing order : 544332
Sum of even numbers : 10
 False
 */

package com.stackroute.unittest;

import java.util.Arrays;

public class IncreasingNumber {
    public boolean doIncrease(String inputString)
    {
        char inputChar[] =inputString.toCharArray();
        Arrays.sort(inputChar);
        char outputChar[]= reverseString(inputChar);
        int sum= evenSum(outputChar);
        return (sum>15?true:false);
    }
    public char[] reverseString(char inputChar[])
    {
        char  temp;
        int length=inputChar.length/2;
        for(int i=0;i<length ;i++)
        {
            temp=inputChar[i];
            inputChar[i]=inputChar[inputChar.length-1-i];
            inputChar[inputChar.length-1-i]=temp;
        }
        return inputChar;
    }
    public int evenSum(char inputChar[])
    {
        int sumEven=0;
        int length=inputChar.length;
        for(int i=0;i<length;i++)
        {
            if(inputChar[i]%2==0)
            {
                sumEven=sumEven+(inputChar[i]-'0');
            }
        }
        return sumEven;
    }
}
