import java.io.InputStream;

public class InputReader {
    public InputReader(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static double getNumber(String input) {
        return Double.parseDouble(input);
    }
    
    public static String getOperation(String input) {
        return input.trim();
    }

	public int readInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double readDouble() {
		// TODO Auto-generated method stub
		return 0;
	}
}
