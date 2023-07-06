import java.util.ArrayList;
import java.util.List;

public class History {
    private List<String> operations;

    public History() {
        operations = new ArrayList<String>();
    }
    
    public void addOperation(String operation) {
        operations.add(operation);
    }
    
    public void printHistory() {
        System.out.println("Calculation History:");
        for (String operation : operations) {
            System.out.println(operation);
        }
    }
}