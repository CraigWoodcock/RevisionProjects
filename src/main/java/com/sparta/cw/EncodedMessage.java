package com.sparta.cw;

public class EncodedMessage {

    public static void main(String[] args) {

        System.out.println(encode("zzzzzzzzzzzz"));

    }

    private static String encode(String plainText){

         char[] plainTextToArray = plainText.toCharArray();

        int currentChar = 1;

        StringBuilder sb = new StringBuilder();

        for (int i=0; i < plainTextToArray.length; i++){
            if(i +1 < plainTextToArray.length && plainTextToArray[i]==plainTextToArray[i+1]){
                currentChar ++;
            }else{
                sb.append(currentChar);
                sb.append(plainTextToArray[i]);
                currentChar = 1;
            }
        }
        return sb.toString();
    }
}
