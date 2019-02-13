/*
Write a program that takes a character from the user as input and determines whether the
character entered is a capital letter, a small case letter, a digit or a special symbol
and display appropriately.
Input:  A
Output:  Capital letter
 */

package com.stackroute.unittest;

public class DisplayCapSmall {
    public String displayCharacter(char inputChar)
    {
        if(inputChar>=65&&inputChar<=90 ||inputChar>=97&&inputChar<=122)
        {
            if (inputChar >= 65 && inputChar <= 90)
            {
                return "Capital Letter";
            } else if (inputChar >= 97 && inputChar <= 122)
            {
                return "Small Letter";
            }
        }
        else if(inputChar>=48&&inputChar<=57)
        {
            return "Digit";
        }
        else
        {
            return "Special Symbol";
        }
        return "ERROR";
    }
}
