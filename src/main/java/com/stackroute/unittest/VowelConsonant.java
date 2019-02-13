/*
Create a program that accepts a word as input and checks for each single character letter in the word whether it is a consonant or vowel.
Condition:
    a. Print an error message if the input is not a letter
    b. If the input having more than one letter, print the required output
          (Vowel or Consonant) for each letter

Input : p
Output : Consonant

Input : ap
Output : Vowel Consonant (should it be a - vowel, p - consonant)
 */

package com.stackroute.unittest;

public class VowelConsonant
{
    public String isVowelConsonant(String inputString)
    {
        int length = inputString.length();
        String temp="";
        for(int i=0;i<length;i++)
        {
            if(inputString.charAt(i)>=65&&inputString.charAt(i)<=90 || inputString.charAt(i)>=97&&inputString.charAt(i)<=122)
            {
                if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'e' || inputString.charAt(i) == 'i' || inputString.charAt(i) == 'o'
                        || inputString.charAt(i) == 'u' || inputString.charAt(i) == 'A' || inputString.charAt(i) == 'E'
                        || inputString.charAt(i) == 'I' || inputString.charAt(i) == 'O' || inputString.charAt(i) == 'U')
                {
                    temp=temp+"vowel"+" ";
                }
                else
                {

                    temp=temp+"consonant"+" ";
                }
            }
            else
            {
                temp=temp+inputString.charAt(i)+" is not a  letter ";
            }
        }
        return temp;
    }
}
