package com.company;

import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(100);
            while (randomNumber % 2 != 0 || randomNumber == 0) {
                randomNumber = random.nextInt(100);
            }
            array[i] = randomNumber;
        }
        System.out.println(Arrays.toString(array));
    }
}
