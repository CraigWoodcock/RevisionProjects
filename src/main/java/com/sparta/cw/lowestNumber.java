package com.sparta.cw;

import java.util.Arrays;
import java.util.Random;

public class lowestNumber {
    public static void main(String[] args) {
        System.out.println("The Lowest Number is "+getLowestNumber());
    }

    private static int getLowestNumber() {
        int[] arr = {12,23,456,3,15,189,56,48,5,4};
        try{
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));

        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        return arr[0];
    }
}