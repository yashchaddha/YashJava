/*
Write a program to reverse any string without using String Buffer.
Input : london
Output : nodnol
 */

package com.stackroute.unittest;

public class ReverseString {
    public String doReverse(String inputString) {
        char inputChar[]= inputString.toCharArray();
        char temp;
        int length=inputChar.length/2;
        for(int i=0;i<length;i++)
        {
            temp=inputChar[i];
            inputChar[i]=inputChar[inputChar.length-1-i];
            inputChar[inputChar.length-1-i]=temp;
        }
        String outputString=new String(inputChar);
        return outputString;
    }
}
