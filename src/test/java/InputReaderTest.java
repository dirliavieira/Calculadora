import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class InputReaderTest {

    @Test
    public void testReadInt_InvalidInput_ReturnsZero() {
        // Arrange
        String input = "invalid";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        InputReader inputReader = new InputReader(in);

        // Act
        int result = inputReader.readInt();

        // Assert
        Assert.assertEquals(0, result);
    }


    @Test
    public void testReadDouble_InvalidInput_ReturnsZero() {
        // Arrange
        String input = "invalid";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        InputReader inputReader = new InputReader(in);

        // Act
        double result = inputReader.readDouble();

        // Assert
        Assert.assertEquals(0.0, result, 0.001);
    }

}
