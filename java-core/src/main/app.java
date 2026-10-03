package main;

public class app {
    public static void main(String[] args) {
        test();
    }

    static void test() {
       int[] nums1 = {1, 2, 3, 1};
       int[] nums2 = {1, 2, 3, 4};
       int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

       int[] nums4 = {3, 2, 3};
       int[] nums5 = {2, 2, 1, 1, 1, 2, 2};
       int[] nums6 = {1};

        // Test containsDuplicate method
        System.out.println(coreJava1.containsDuplicate(nums1)); // true
        System.out.println(coreJava1.containsDuplicate(nums2)); // false
        System.out.println(coreJava1.containsDuplicate(nums3)); // true

        // Test isAnagram method
        System.out.println(coreJava1.isAnagram("anagram", "nagaram")); // true
        System.out.println(coreJava1.isAnagram("rat", "car")); // false

        // Test firstUniqChar method
        System.out.println(coreJava1.firstUniqChar("leetcode")); // 0
        System.out.println(coreJava1.firstUniqChar("loveleetcode")); // 2
        System.out.println(coreJava1.firstUniqChar("aabb")); // -1

        // Test majorityElement method
        System.out.println(coreJava1.majorityElement(nums4)); // 3
        System.out.println(coreJava1.majorityElement(nums5)); // 2
        System.out.println(coreJava1.majorityElement(nums6)); // 1
    }
}
