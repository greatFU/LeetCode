package com.fernando.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidAnagramTest {
	@Test
    public void returnsTrueForForAnagrams() {
        Assert.assertTrue(ValidAnagram.isAnagram("aab", "aba"));
    }

    @Test
    public void returnsFalseForDifferentCharacters() {
        Assert.assertFalse(ValidAnagram.isAnagram("rat", "car"));
    }

    @Test
    public void returnsFalseForDifferentLengths() {
        Assert.assertFalse(ValidAnagram.isAnagram("a", "aa"));
    }
}
