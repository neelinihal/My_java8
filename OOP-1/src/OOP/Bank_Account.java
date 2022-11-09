package OOP;

public class Bank_Account {
    public long account_number;
    public long balance;
    public String Customer_Name;
    public String email;
    public long phone_number;


    //CONSTRUCTOR = 1
    public Bank_Account() {
        this.Bank_Account(123456,1200,"nihal","neelinihal290@gmail.com",990809918);
        System.out.println("This is the bank account of NEELI NIHAL");
    }

    //CONSTRUCTOR = 2
    public void Bank_Account(long account_number,long balance,String Customer_Name,String email,long phone_number) {
        this.phone_number = phone_number;
        this.account_number = account_number;
        this.balance = balance;
        this.email = email;
        this.Customer_Name = Customer_Name;
    }

    //CONSTRUCTOR = 3
    public Bank_Account(String Customer_Name, String email, long phone_number) {
        this.Customer_Name = "mani";
    }

    public void deposit(double depositamount){
        balance += depositamount;
        System.out.println("deposit of "+depositamount+" made, total balance is "+balance);
    }
    public void withdraw(double withdrawamount){
        if (balance - withdrawamount<0) {
            System.out.println("Insufficient funds");
        }
        else {
            balance-=withdrawamount;
            System.out.println("after withdrawl remaning balance is "+balance);
        }
    }

    public long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(long account_number) {
        this.account_number = account_number;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }
}