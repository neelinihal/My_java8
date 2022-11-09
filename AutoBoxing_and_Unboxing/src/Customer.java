import java.util.ArrayList;

public class Customer {
    private String Name;
    private ArrayList<Double> transactions;

    public Customer(String name,double initialTransactions) {
        this.Name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialTransactions);
    }

    public void addTransaction(double amount){
        transactions.add(amount);
    }

    public String getName() {
        return Name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
