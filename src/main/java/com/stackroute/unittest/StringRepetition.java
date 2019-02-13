/*
Write a program for the following condition:
Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should repeat n number of times in the output String.

Input1:            Stackroute

Input2:            5

Output1:           Stackrouterouterouterouterouteroute


Input1:            Stackroute

Input2:            2

Output1:           Stackroutetete
 */

package com.stackroute.unittest;

public class StringRepetition
{
    public String isRepetition(String inputString,int inputNumber)
    {
        String temp="";
        int length =inputString.length();
        for(int i=0;i<length;i++)
        {
            if(i>=(length-inputNumber))
            {
                temp=temp+inputString.charAt(i);
            }
        }
        for(int i=1;i<=inputNumber;i++)
        {
            inputString=inputString+temp;
        }
        return inputString;
    }
}