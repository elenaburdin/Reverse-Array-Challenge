package com.challenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reverse(array);

    }

    private static void reverse(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("nonReverse = " + array[i]);
        }
        for(int i = array.length-1;i>=0;i--) {
            System.out.println("Reverse = " + array[i]);
        }
    }
}