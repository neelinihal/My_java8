public class Main_Bank {
    public static void main(String[] args) {

        Bank bank = new Bank("National Indian Bank");
        bank.addBranch("Telangana");
        bank.addCustomer("Telangana","mani",500.00);
        bank.addCustomer("Telangana","Tim",500.00);
        bank.addCustomer("Telangana","nicky",1000.00);

        bank.addBranch("Nirmal");
        bank.addCustomer("Nirmal","mammu",5000.00);
        bank.addCustomer("Nirmal","anu",8000.00);

        bank.addCustomerTransactions("Telangana","mani",1000);
        bank.addCustomerTransactions("Telangana","mani",10000);
        bank.addCustomerTransactions("Nirmal","mammu",9000.00);

        bank.listCustomers("Telangana",true);

        if (!bank.addBranch("Nirmal")){
            System.out.println("Branch already exists");
        }

        if (!bank.addCustomer("adilabad","mani",500)){
            System.out.println("Branch does not exists");
        }
    }
}
