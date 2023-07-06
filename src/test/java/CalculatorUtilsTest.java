import org.junit.Assert;
import org.junit.Test;

public class CalculatorUtilsTest {

    @Test
    public void testCalculatePercentage() {
        double number = 50.0;
        double percentage = 20.0;
        double expected = 10.0;

        double result = CalculatorUtils.calculatePercentage(number, percentage);

        Assert.assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testCalculateFactorial() {
        int number = 5;
        int expected = 120;

        double result = CalculatorUtils.calculateFactorial(number);

        Assert.assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testCalculateAverage() {
        double[] numbers = { 2.5, 3.5, 4.0 };
        double expected = 3.3333;

        double result = CalculatorUtils.calculateAverage(numbers);

        Assert.assertEquals(expected, result, 0.0001);
    }
}
