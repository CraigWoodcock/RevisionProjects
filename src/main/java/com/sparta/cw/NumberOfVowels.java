package com.sparta.cw;
public class NumberOfVowels
{
    private static int getNumVowels(String word){

        int numberOfVowels = 0;
        char[] vowels = {'a','e','i','o','u'};
        char[] letter = word.toCharArray();

        for (int i = 0; i < letter.length; i++){
            for (int j = 0; j < vowels.length;j++){
                if (vowels[j]==letter[i]){
                    numberOfVowels++;
                }
            }
        }
        return numberOfVowels;
    }

//    private static int getNumberOfVowels(int numberOfVowels, char[] letter) {
//        for (int i = 0; i < letter.length; i++){
//            if (letter[i]=='a' ||
//                    letter[i]=='e' ||
//                    letter[i]=='i' ||
//                    letter[i]=='o' ||
//                    letter[i]=='u'){
//                numberOfVowels += 1;
//            }
//        }
//
//        if (numberOfVowels==0){
//            System.out.println("The string did not contain any vowels");
//        }else {
//            System.out.println("The string contained ");
//        }
//        return numberOfVowels;
//    }


    public static void main( String[] args )
    {
        System.out.println(getNumVowels("aeiou"));
        int vowels = getNumVowels("aeiou");
        System.out.println("Everyone Knows there are " + vowels + " Vowels");

    }
}
