package com.shocknode.hackerrank;

import java.util.stream.IntStream;

public class AlternatingCharacters {
    
    public static int test(String s){
        
        return Long.valueOf(
                IntStream.range(0, s.length()-1)
                .filter(i -> s.charAt(i) == s.charAt(i+1))
                .count()
            ).intValue();
        
    }
    
}
