/*
Write a program which accepts a number as input and check whether the given number is palindrome or not If it is a palindrome then
a. Add all the even numbers and check whether the sum is more than 25.
b. Print success and failure messages for all 3 conditions
Input : 2468642

Output : 2468642 is palindrome and the sum of even numbers is greater than 25

Input: 12345

Output: 12345 is not palindrome

Input: 12345654321

Output : 12345654321 is palindrome and sum of even numbers is less than 25
 */

package com.stackroute.unittest;

public class Palindrome {
    public String checkInput(String inputString)
    {
        int sumEven=0;
        try
        {
            Long.parseLong(inputString);
            boolean isPalindrome= checkPalindrome(inputString);
            int length=inputString.length();
            if(isPalindrome)
            {
                for(int i=0;i<length;i++)
                {
                    if(inputString.charAt(i)%2==0)
                    {
                        sumEven=sumEven+(inputString.charAt(i)-'0');
                    }
                }
                if(sumEven>25)
                {
                    return inputString+" is palindrome and the sum of even numbers is greater than 25";
                }
                else
                {
                    return inputString+" is palindrome and the sum of even numbers is less than 25";
                }
            }
            else
            {
                return inputString+" is not palindrome";
            }
        }
        catch (NumberFormatException e)
        {
            return "Enter numbers Only";
        }
    }
    public boolean checkPalindrome(String inputString)
    {
        int length=inputString.length();
        for(int i=0;i<=length/2;i++)
        {
            if(inputString.charAt(i)!=inputString.charAt(length-i-1))
            {
                return false;
            }
        }
        return true;
    }
}
