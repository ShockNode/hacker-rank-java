package com.shocknode.hackerrank;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SockMerchant {
    
    public static int test(int n, int[] arr){
        
        return Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
                .values()
                .stream()
                .map(i -> Math.floorDiv(i, 2))
                .mapToInt(Long::intValue)
                .sum();
        
    }
    
}
