package com.fernando.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MergeSortedArrayTest {
    @Test
    public void mergesInterleavedValues() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};

        MergeSortedArray.merge(nums1, 3, nums2, 3);

        Assert.assertEquals(nums1, new int[]{1, 2, 2, 3, 5, 6});
    }

    @Test
    public void preservesFirstArrayWhenSecondIsEmpty() {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};

        MergeSortedArray.merge(nums1, 1, nums2, 0);

        Assert.assertEquals(nums1, new int[]{1});
    }

    @Test
    public void copiesSecondArrayWhenFirstHasNoValues() {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};

        MergeSortedArray.merge(nums1, 0, nums2, 1);

        Assert.assertEquals(nums1, new int[]{1});
    }

    @Test
    public void mergesWhenSecondArrayContainsSmallerValues() {
        int[] nums1 = new int[]{4, 5, 6, 0, 0, 0};
        int[] nums2 = new int[]{1, 2, 3};

        MergeSortedArray.merge(nums1, 3, nums2, 3);

        Assert.assertEquals(nums1, new int[]{1, 2, 3, 4, 5, 6});
    }
}
