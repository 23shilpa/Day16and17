package com.bridgelabz;


import java.util.Arrays;

//Race care
public class Anagram {
    public static void main(String[] args) {
        String str1 = "heart".toLowerCase();
        String str2 = "earth".toLowerCase();

        if (str1.length()==str2.length()){
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean result = Arrays.equals(ch1,ch2);
            if (result){
                System.out.println("the given word is Anagram");
            }else {
                System.out.println("The given word is not Anagram");
            }
        }
    }
}
