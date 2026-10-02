package main;

public class app {
    public static void main(String[] args) {
        test();
    }

    static void test() {
       int[] nums1 = {1, 2, 3, 1};
       int[] nums2 = {1, 2, 3, 4};
       int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(coreJava1.containsDuplicate(nums1)); // true
        System.out.println(coreJava1.containsDuplicate(nums2)); // false
        System.out.println(coreJava1.containsDuplicate(nums3)); // true
    }
}
