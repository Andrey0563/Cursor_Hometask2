package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(101);
            while (randomNumber % 2 != 0 || randomNumber == 0){
                randomNumber = random.nextInt(101);
            }
            array[i] = randomNumber;
        }
        System.out.println(Arrays.toString(array));
    }
}
