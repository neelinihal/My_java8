import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String newCustomer, double initialAmount){
        if(findCustomer(newCustomer) == null) {
            this.customers.add(new Customer(newCustomer, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String Customer, double amount){
        Customer existingCustomer = findCustomer(Customer);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        for (int i = 0; i <this.customers.size(); i++){
            Customer customer = this.customers.get(i);
            if(customer.equals(customerName)){
                return this.customers.get(i);
            }
        }
        return null;
    }
}
