package OOP;

public class Customer {
    public String name;
    public int credit_limit;
    public String email;

    public Customer() {
        this("default name",5000,"defaultemail");
        System.out.println("It is VIP bank");
    }

    public Customer(String name, int credit_limit) {
        this(name,credit_limit,"unkown@email.com");
        this.name = name;
        this.credit_limit = credit_limit;
    }

    public Customer(String name, int credit_limit, String email) {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }
}
