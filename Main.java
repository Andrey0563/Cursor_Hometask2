package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        int [] array = new int[13];

        for (int i = 0; i < array.length; i++){
            array [i] = rand.nextInt(100);

        }
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                System.out.println(array[i]);
            }

        }


        }
}
