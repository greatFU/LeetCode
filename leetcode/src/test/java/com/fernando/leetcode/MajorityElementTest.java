package com.fernando.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MajorityElementTest {
    @Test
    public void findsMajorityInShortArray() {
        Assert.assertEquals(MajorityElement.majorityElement(new int[]{3, 2, 3}), 3);
    }

    @Test
    public void findsMajorityAfterCandidateChanges() {
        Assert.assertEquals(MajorityElement.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}), 2);
    }
    
    @Test
    public void findsMajorityWithOneElement() {
        Assert.assertEquals(MajorityElement.majorityElement(new int[]{1}), 1);
    }
    
    @Test
    public void returnsMinusOneWhenMajorityDoesNotExist() {
        Assert.assertEquals(MajorityElement.majorityElement(new int[]{1,2,3}), -1);
    }
    
    @Test
    public void returnsMinusOneWhenMostFrequentElementIsNotMajority() {
        Assert.assertEquals(MajorityElement.majorityElement(new int[]{1,2,3,4,4}), -1);
    }
    
    
}
