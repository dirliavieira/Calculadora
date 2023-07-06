import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class SystemTest<Scanner> {

    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Mock
    private Calculator mockCalculator;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test
    public void testCalculatorSystem() {

        when(mockCalculator.performOperation(2, 3, "+")).thenReturn(5.0);

        String userInput = "2\n+\n3\nexit\n";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));


        String expectedOutput = "Entre com a operação (+, -, *, /): Entre com o primeiro número: Entre com o segundo número: Resultado: 5.0\n";
        assertEquals(expectedOutput, outputStream.toString());

        verify(mockCalculator).performOperation(2, 3, "+");
    }
}
