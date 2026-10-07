package com.fernando.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstUniqueCharacterInAStringTest {
    @Test
    public void returnsIndexOfFirstCharacterWhenUnique() {
        Assert.assertEquals(FirstUniqueCharacterInAString.firstUniqChar("leetcode"), 0);
    }

    @Test
    public void returnsIndexOfLaterUniqueCharacter() {
        Assert.assertEquals(FirstUniqueCharacterInAString.firstUniqChar("loveleetcode"), 2);
    }

    @Test
    public void returnsMinusOneWhenNoCharacterIsUnique() {
        Assert.assertEquals(FirstUniqueCharacterInAString.firstUniqChar("aabb"), -1);
    }
}
