package com.shocknode.hackerrank;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SherlockString {
    
    public static boolean test(String s){

        Map<String, Long> map = Stream.of(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            long min = map.values().stream().min(Long::compareTo).get();
            long max = map.values().stream().max(Long::compareTo).get();

            if(min == max) { return true;} //all frequencies equal
            if((max - min) > 1) {return false;} //removing one character can not make the equal

            //for other cases make sure that only one frequency is different
            int countBiggerThanMin = map.values()
                    .stream()
                    .mapToInt(v -> (v > min) ? 1 : 0)
                    .sum();

            if((countBiggerThanMin == 1) || //only one bigger than min
                    (countBiggerThanMin == (map.size() - 1))) { //min is smaller than all others
                return true;
            }
            return false;
    }
        
    
}
