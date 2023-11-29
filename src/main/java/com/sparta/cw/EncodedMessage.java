package com.sparta.cw;

public class EncodedMessage {

    public static void main(String[] args) {

        System.out.println(encode("aabhheettr"));

    }

    private static String encode(String plainText){

         char[] charArray = plainText.toCharArray();

        int counter = 1;

        StringBuilder sb = new StringBuilder();

        for (int i=0; i < charArray.length; i++){
            if(i +1 < charArray.length && charArray[i]==charArray[i+1]){
                counter ++;
            }else{
                sb.append(counter);
                sb.append(charArray[i]);
                counter = 1;
            }
        }
        return sb.toString();
    }
}
