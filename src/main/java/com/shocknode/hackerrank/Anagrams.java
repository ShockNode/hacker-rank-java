package com.shocknode.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Anagrams {

    public static int test2(String first, String second) {

        int[] arr = new int[26];
        
        for(int i = 0; i < first.length(); i++){
            arr[first.charAt(i) - 'a']++;
        }
        for(int j = 0; j < second.length(); j++){
            arr[second.charAt(j) - 'a']--;
        }

        int count = 0;
        for (int k: arr) {
            if (k != 0) {
                count += Math.abs(k);
            }
        }
        return count;
        
    }
    
    public static int test(String first, String second) {
        
        //  instantiate int array with size of 26 representing each letter of the alphabet
        int[] arr = new int[26];
        
        //  loop through each character of first string incrementing by 1 at each character index
        IntStream.range(0, first.length())
                .forEach(i -> arr[first.charAt(i) - 'a']++); // a - a == 0, b - a == 1, c - a == 2, ... z - a == 25


        //  loop through each character of second string decrementing by 1 at each character index
        IntStream.range(0, second.length())
                .forEach(i -> arr[second.charAt(i) - 'a']--); // a - a == 0, b - a == 1, c - a == 2, ... z - a == 25
        
        return Arrays.stream(arr)
                .filter(i -> i != 0) // filter for non 0 values AKA characters present in both strings
                .map(Math::abs) //  map to positive integer
                .sum(); // get sum representing total # of characters needed to be removed

    }
    
}
