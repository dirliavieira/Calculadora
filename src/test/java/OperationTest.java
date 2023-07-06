import org.junit.Assert;
import org.junit.Test;

public class OperationTest {

    @Test
    public void testAdd() {
        double result = Operation.add(2.5, 3.5);
        Assert.assertEquals(6.0, result, 0.001);
    }

    @Test
    public void testSubtract() {
        double result = Operation.subtract(5.0, 2.0);
        Assert.assertEquals(3.0, result, 0.001);
    }

    @Test
    public void testMultiply() {
        double result = Operation.multiply(2.0, 4.0);
        Assert.assertEquals(8.0, result, 0.001);
    }

    @Test
    public void testDivide() {
        double result = Operation.divide(10.0, 2.0);
        Assert.assertEquals(5.0, result, 0.001);
    }
}

