package com.fernando.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContainsDuplicateTest {
    @Test
    public void returnsTrueWhenDuplicateExists() {
        Assert.assertTrue(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void returnsFalseWhenAllElementsAreUnique() {
        Assert.assertFalse(ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void returnsTrueWhenSeveralValuesRepeat() {
        Assert.assertTrue(ContainsDuplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
