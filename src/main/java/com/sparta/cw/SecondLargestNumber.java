package com.sparta.cw;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] numArray = {22, 34, 35, 12, 6, 8, 99, 180, 5,1};
        Arrays.sort(numArray);
        int arraySize = numArray.length;

        int largestNum = numArray[arraySize-1];
        int secondLargestNum = numArray[arraySize-2];

        System.out.println("The largest number in the array is : " + largestNum);
        System.out.println("The second argest number in the array is : " + secondLargestNum);

    }
}
