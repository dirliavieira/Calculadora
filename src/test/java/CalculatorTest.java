import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testPerformOperation_Addition() {
        double result = calculator.performOperation(2.5, 3.5, "+");
        Assert.assertEquals(6.0, result, 0.001);
    }

    @Test
    public void testPerformOperation_Subtraction() {
        double result = calculator.performOperation(5.0, 2.0, "-");
        Assert.assertEquals(3.0, result, 0.001);
    }

    @Test
    public void testPerformOperation_Multiplication() {
        double result = calculator.performOperation(2.0, 4.0, "*");
        Assert.assertEquals(8.0, result, 0.001);
    }

    @Test
    public void testPerformOperation_Division() {
        double result = calculator.performOperation(10.0, 2.0, "/");
        Assert.assertEquals(5.0, result, 0.001);
    }
}
