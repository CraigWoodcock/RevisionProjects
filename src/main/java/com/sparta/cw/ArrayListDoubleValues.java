package com.sparta.cw;

import java.util.ArrayList;

public class ArrayListDoubleValues {
    public static void main(String[] args) {
        arrayListDoubleValues();
    }
    public static void arrayListDoubleValues() {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(25);
        arr.add(35);
        arr.add(58);
        arr.add(62);
        arr.add(1);
        arr.add(12);
        arr.add(4);
        arr.add(19);
        arr.add(15);

        arr.stream()
                .sorted()
                .map(value -> value * 2)
                .skip(arr.size() / 2)
                .forEach(System.out::println);
    }
}
