package com.fernando.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a string s, find the first non-repeating character in it and return its index. 
 * If it does not exist, return -1.
 */

public class FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
