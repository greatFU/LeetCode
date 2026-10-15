package com.fernando.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) - 1);
            if (charCounts.get(c) < 0) {
                return false;
            }
        }
        return true;
    }
}
