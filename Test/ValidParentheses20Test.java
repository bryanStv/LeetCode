import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParentheses20Test {

    @Test
    void isValid() {
        Assert.assertEquals(true,ValidParentheses20.isValid("{}()[]"));
        Assert.assertEquals(false,ValidParentheses20.isValid("{}()[])"));
        Assert.assertEquals(false,ValidParentheses20.isValid("{}()[]{"));
        Assert.assertEquals(true,ValidParentheses20.isValid("({}()[])"));
        Assert.assertEquals(false,ValidParentheses20.isValid("]"));
        Assert.assertEquals(false,ValidParentheses20.isValid("{"));
    }
}