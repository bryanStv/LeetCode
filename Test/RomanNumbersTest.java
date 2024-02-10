import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumbersTest {

    @org.junit.jupiter.api.Test
    void romanToInt() {
        Assert.assertEquals(21,RomanNumbers.romanToInt("XXI"));
        Assert.assertEquals(3,RomanNumbers.romanToInt("III"));
        Assert.assertEquals(58,RomanNumbers.romanToInt("LVIII"));
        Assert.assertEquals(1994,RomanNumbers.romanToInt("MCMXCIV"));
    }
}