/*
The problem is that we want to find duplicates in a T[] one-dimensional array of integers in O(N) running time
where the integer values are smaller than the length of the array!
 */

package com.ankitech.arrays;

import java.util.HashSet;
import java.util.Set;

class Duplicates {
    static int[] checkDuplicates(int[] numbers) {
        Set<Integer> duplicates =  new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[Math.abs(numbers[i])] >= 0){
                numbers[Math.abs(numbers[i])] = -numbers[Math.abs(numbers[i])];
            }
            else{
                duplicates.add(Math.abs(numbers[i]));
            }
        }

        return duplicates.stream().mapToInt(i -> i).toArray();
    }
}
