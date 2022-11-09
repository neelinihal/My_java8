import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branch;

    public Bank(String name) {
        this.name = name;
        this.branch = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName)==null){
            branch.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName,String customerName,double initialAmount){
        Branch branch1 = findBranch(branchName);
        if (branch1!=null){
            return branch1.addCustomer(customerName,initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransactions(String branchName,String customerName,double amount){
        Branch branch1 = findBranch(branchName);
        if (branch1 != null){
            return branch1.addTransaction(customerName,amount);
        }
        return false;
    }

    public Branch findBranch(String branchName){
        for (int i = 0; i < branch.size();i++){
            Branch branch1 = this.branch.get(i);
            if (branch1.getName().equals(branchName)){
                return branch1;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName,boolean showTransactions){
        Branch branch1 = findBranch(branchName);
        if (branch1 != null){
            System.out.println("Customer details for branch "+branch1.getName());
            ArrayList<Customer> branchCustomers = branch1.getCustomers();
            for (int i = 0; i < branchCustomers.size() ; i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: "+branchCustomer.getName()+"["+(i+1)+"]");
                if (showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("["+(j+1)+"] amount"+transactions.get(j));
                    }
                }
            }
            return true;
        }else {
        return false;
       }
    }
}
