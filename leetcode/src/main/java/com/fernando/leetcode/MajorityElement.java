package com.fernando.leetcode;

/*
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. 
 */

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        int candidateCount = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num != candidate) {
                count--;
            } else {
                count++;
            }
        }
        for (int num : nums) {
        	if(num == candidate)
        		candidateCount++;
        }
        return (nums.length/2 < candidateCount) ? candidate : -1;
    }
}
