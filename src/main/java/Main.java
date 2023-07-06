import java.util.Scanner;

public class Main {

    private Calculator calculator;

    public void start(Scanner scanner) {
    	System.out.println("Calculator!");

        while (true) {
            System.out.print("Entre com a operação (+, -, *, /) or 'exit' para sair: ");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Primeiro número: ");
            double num1 = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Segundo número: ");
            double num2 = scanner.nextDouble();
            scanner.nextLine(); 

            double result = calculator.performOperation(num1, num2, operation);
            System.out.println("Resultado: " + result);
        }

    }

	public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter operation (+, -, *, /, %, !, avg): ");
            String operation = scanner.nextLine();

            if (operation.equals("exit")) {
                break;
            }

            if (operation.equals("%")) {
                System.out.print("Enter number: ");
                double number = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character

                System.out.print("Enter percentage: ");
                double percentage = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character

                double result = CalculatorUtils.calculatePercentage(number, percentage);
                System.out.println("Result: " + result);
            } else if (operation.equals("!")) {
                System.out.print("Enter number: ");
                int number = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                double result = CalculatorUtils.calculateFactorial(number);
                System.out.println("Result: " + result);
            } else if (operation.equals("avg")) {
                System.out.print("Enter number of values: ");
                int count = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                double[] numbers = new double[count];
                for (int i = 0; i < count; i++) {
                    System.out.print("Enter value " + (i + 1) + ": ");
                    numbers[i] = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                }

                double result = CalculatorUtils.calculateAverage(numbers);
                System.out.println("Result: " + result);
            } else {
                System.out.print("Enter first number: ");
                double number1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                double number2 = scanner.nextDouble();

                scanner.nextLine(); // Consume the newline character

                double result;
                try {
                    result = calculator.performOperation(number1, number2, operation);
                    System.out.println("Result: " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            System.out.println();
        }

        calculator.printHistory();

        scanner.close();
    }

}
