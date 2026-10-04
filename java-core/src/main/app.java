package main;

public class App {
    public static void main(String[] args) {
        hw1();
    }

    static void hw1() {
       int[] nums1 = {1, 2, 3, 1};
       int[] nums2 = {1, 2, 3, 4};
       int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

       int[] nums4 = {3, 2, 3};
       int[] nums5 = {2, 2, 1, 1, 1, 2, 2};
       int[] nums6 = {1};

       int[] nums7 = {1,2,3,0,0,0};
       int[] nums8 = {2,5,6};
       int[] nums9 = {1};
       int[] nums10 = {};
       int[] nums11 = {0};
       int[] nums12 = {1};

        // Test containsDuplicate method
        System.out.println(СoreJava1.containsDuplicate(nums1)); // true
        System.out.println(СoreJava1.containsDuplicate(nums2)); // false
        System.out.println(СoreJava1.containsDuplicate(nums3)); // true

        // Test isAnagram method
        System.out.println(СoreJava1.isAnagram("anagram", "nagaram")); // true
        System.out.println(СoreJava1.isAnagram("rat", "car")); // false

        // Test firstUniqChar method
        System.out.println(СoreJava1.firstUniqChar("leetcode")); // 0
        System.out.println(СoreJava1.firstUniqChar("loveleetcode")); // 2
        System.out.println(СoreJava1.firstUniqChar("aabb")); // -1

        // Test majorityElement method
        System.out.println(СoreJava1.majorityElement(nums4)); // 3
        System.out.println(СoreJava1.majorityElement(nums5)); // 2
        System.out.println(СoreJava1.majorityElement(nums6)); // 1

        // Test merge method
        СoreJava1.merge(nums7, 3, nums8, 3); // {1, 2, 2, 3, 5, 6}
        СoreJava1.merge(nums9, 1, nums10, 0); // {1}
        СoreJava1.merge(nums11, 0, nums12, 1); // {1}
        
        System.out.println("Merged nums7: " + java.util.Arrays.toString(nums7));
        System.out.println("Merged nums9: " + java.util.Arrays.toString(nums9));
        System.out.println("Merged nums11: " + java.util.Arrays.toString(nums11));
    }
}
