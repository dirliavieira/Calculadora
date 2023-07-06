import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MemoryTest {

    private Memory memory;

    @Before
    public void setup() {
        memory = new Memory();
    }

    @Test
    public void testSetValue_GetValue_ReturnsCorrectValue() {
        double value = 5.0;
        memory.setValue(value);
        double retrievedValue = memory.getValue();
        Assert.assertEquals(value, retrievedValue, 0.001);
    }

    @Test
    public void testGetValue_DefaultValue_ReturnsZero() {
        double defaultValue = 0.0;
        double retrievedValue = memory.getValue();
        Assert.assertEquals(defaultValue, retrievedValue, 0.001);
    }
}
