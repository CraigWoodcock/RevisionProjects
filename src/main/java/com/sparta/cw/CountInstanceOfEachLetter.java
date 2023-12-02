package com.sparta.cw;

import java.util.HashMap;

public class CountInstanceOfEachLetter {
    public static void main(String[] args) {
        countInstancesOfEachLetter();
    }

    public static void countInstancesOfEachLetter() {
        String testString = "lulu loves bananas";

        HashMap<Character, Integer> map = new HashMap<>();

        try {
            char[] charArray = testString.toCharArray();
            for (char letter:charArray) {
                if(map.containsKey(letter)){
                    map.replace(letter,map.get(letter)+1);
                }else{
                    map.put(letter,1);
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.print(map);
    }
}
