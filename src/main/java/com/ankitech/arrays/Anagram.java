/*
Construct an algorithm to check whether two words (or phrases) are anagrams or not!

"An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once"
 */
package com.ankitech.arrays;

import java.util.Arrays;

class Anagram {
     static boolean checkAnagram(String string1, String string2) {
        char[] chars1 = string1.toLowerCase().toCharArray();
        char[] chars2 = string2.toLowerCase().toCharArray();

        if(string1.length() != string2.length()){
            return false;
        }

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < chars1.length; i++) {
            if(chars1[i] != chars2[i]){
                return false;
            }
        }

        return true;
    }
}
