import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;

@RunWith(Arquillian.class)
public class _IntegrationTest {

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClasses(Calculator.class, Operation.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Test
    public void testCalculatorIntegration() {
        Calculator calculator = new Calculator();
        double result = calculator.performOperation(2.0, 3.0, "+");
        Assert.assertEquals(5.0, result, 0.001);
    }
    
    @Test
    public void testAdditionIntegration() {
        Calculator calculator = new Calculator();
        double result = calculator.performOperation(2.0, 3.0, "+");
        Assert.assertEquals(5.0, result, 0.001);
    }

    @Test
    public void testSubtractionIntegration() {
        Calculator calculator = new Calculator();
        double result = calculator.performOperation(5.0, 3.0, "-");
        Assert.assertEquals(2.0, result, 0.001);
    }

    @Test
    public void testMultiplicationIntegration() {
        Calculator calculator = new Calculator();
        double result = calculator.performOperation(2.0, 3.0, "*");
        Assert.assertEquals(6.0, result, 0.001);
    }

    @Test
    public void testDivisionIntegration() {
        Calculator calculator = new Calculator();
        double result = calculator.performOperation(10.0, 2.0, "/");
        Assert.assertEquals(5.0, result, 0.001);
    }
}