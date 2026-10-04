package main;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class СoreJava1 {


    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(!seen.add(num)){
                return true;
            }
        } 
        return false;
    }



    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length())
            return false;
        Map<Character,Integer> charCounts = new HashMap<>();
        
        for(char c : s.toCharArray()){
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray()){
            charCounts.put(c, charCounts.getOrDefault(c, 0) - 1);
            if(charCounts.get(c) < 0){
                return false;
            }
        }
        return true;
    }



    public static int firstUniqChar(String s) {
        Map<Character,Integer> count = new HashMap<>();

        for(char c : s.toCharArray()){
            count.put(c, count.getOrDefault(c, 0) + 1);
            }

        for(int i=0; i<s.length(); i++){
            if (count.get(s.charAt(i)) == 1)
            return i;
        }
        return -1;
    }



    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for(int num : nums){
            if(count == 0){
                candidate = num;
            }   
            if(num != candidate){
                count--;
            }else{
                count++;
            } 
        }
        return candidate;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i = nums1.length-1; n > 0; i--){
            if(m == 0){
                nums1[i] = nums2[n-1];
                n--;
            } else if(nums1[m-1] > nums2[n-1]){
                nums1[i] = nums1[m-1];
                m--;
                }else{
                    nums1[i] = nums2[n-1];
                    n--;
            }
        }
    }
}
