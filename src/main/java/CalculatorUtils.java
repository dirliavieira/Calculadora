public class CalculatorUtils {
    public static double calculatePercentage(double number, double percentage) {
        return number * (percentage / 100);
    }

    public static double calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static double calculateAverage(double[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Cannot calculate average of an empty array");
        }
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
