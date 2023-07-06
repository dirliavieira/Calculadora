import org.junit.Assert;
import org.junit.Test;

public class ValidatorTest {

    @Test
    public void testIsValidNumber_ValidNumber_ReturnsTrue() {
        boolean result = Validator.isValidNumber("123.45");
        Assert.assertTrue(result);
    }

    @Test
    public void testIsValidNumber_InvalidNumber_ReturnsFalse() {
        boolean result = Validator.isValidNumber("abc");
        Assert.assertFalse(result);
    }

    @Test
    public void testIsValidOperation_ValidOperation_ReturnsTrue() {
        boolean result = Validator.isValidOperation("+");
        Assert.assertTrue(result);
    }

    @Test
    public void testIsValidOperation_InvalidOperation_ReturnsFalse() {
        boolean result = Validator.isValidOperation("$");
        Assert.assertFalse(result);
    }
}
