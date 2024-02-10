import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefix14Test {

    @Test
    void longestCommonPrefix() {
        String[] palabras = {"flower","flow","flight"};
        Assert.assertEquals("fl",LongestCommonPrefix14.longestCommonPrefix(palabras));
        palabras = new String[]{"baab", "bacb", "b", "cbc"};
        Assert.assertEquals("",LongestCommonPrefix14.longestCommonPrefix(palabras));
        palabras = new String[]{"cb","cbb","a"};
        Assert.assertEquals("",LongestCommonPrefix14.longestCommonPrefix(palabras));
        palabras = new String[]{"aaa","aa","aaa"};
        Assert.assertEquals("aa",LongestCommonPrefix14.longestCommonPrefix(palabras));
        palabras = new String[]{"abca","aba","aaab"};
        Assert.assertEquals("a",LongestCommonPrefix14.longestCommonPrefix(palabras));
    }
}