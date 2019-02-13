/*
Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 - 100)
User should guess until the the target number is guessed correctly.
Print separate messages for the following:
    a. Number guessed is more than original number
    b. Number guessed is less than original number
    c. Number guessed matches the original number
 */

package com.stackroute.unittest;

import java.util.Random;

public class RandomNumber {
    public String isRandomNumber(int guessNumber) {
        Random random= new Random();
        int nextRandom=random.nextInt(100);
        do {
            if (guessNumber > nextRandom) {
                return "Number guessed is more than original number";

            } else if (guessNumber < nextRandom) {
                return "Number guessed is less than original number";
            }
        }
        while (guessNumber!=nextRandom);
        return"Number guessed matches the original number";
    }
}
