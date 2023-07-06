public class Calculator {
    private History history;

    public Calculator() {
        history = new History();
    }

    public double performOperation(double a, double b, String operation) {
        double result = 0.0;
        switch (operation) {
            case "+":
                result = Operation.add(a, b);
                break;
            case "-":
                result = Operation.subtract(a, b);
                break;
            case "*":
                result = Operation.multiply(a, b);
                break;
            case "/":
                result = Operation.divide(a, b);
                break;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }

        String logMessage = a + " " + operation + " " + b + " = " + result;
        history.addOperation(logMessage);

        return result;
    }

    public void printHistory() {
        history.printHistory();
    }
}
