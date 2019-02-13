/*
Write a program that reads an unspecified number of integer arguments using Scanner Class
and adds them together.The program should display total of the given input number and
should only consider integer value.The program should display an error message if there
are any non integer values.
Input :  12 23 2 4
Output : 41
 */

package com.stackroute.unittest;

public class Addition {
    public String doAddition(String inputString) {
        {
            String temp = "";
            int num = 0;
            int sum =0;
            int length=inputString.length();
            try
            {
                for (int i = 0; i < length; i++) {
                    if (inputString.charAt(i) != ' ') {
                        temp = temp + inputString.charAt(i);
                    } else {
                        num = Integer.parseInt(temp);
                        sum = sum + num;
                        temp = "";
                    }
                }
                num = Integer.parseInt(temp);
                sum = sum + num;
                temp="";
                temp=temp+sum;
                return temp;
            }
            catch (NumberFormatException e)
            {
                return "Enter Integer Only";
            }


        }
    }
}
