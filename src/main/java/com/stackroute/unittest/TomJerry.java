/*
Write a program which accepts an integer number as input from the user and perform the following conditional checks:
a. Print Tom if number is odd and exists between 20 to 30
b. Print Jerry, if number is even and exists between 20 and 30
 */

package com.stackroute.unittest;

public class TomJerry
{
    public String TomAndJerry(int inputNumber)
    {
        if(inputNumber>20 && inputNumber<30)
        {
            if(inputNumber%2!=0)
            {
                return "Tom";
            }
            else
            {
                return "Jerry";
            }
        }
        else
        {
            return "Number is not in the between 20 and 30";
        }
    }
}
