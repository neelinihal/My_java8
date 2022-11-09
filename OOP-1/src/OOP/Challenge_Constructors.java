package OOP;

public class Challenge_Constructors {
    public static void main(String[] args ){
        Customer nihal_bank = new Customer();
        System.out.println("nihal1"+"  "+nihal_bank.getName());

        Customer bank = new Customer("nihal",5000);
        System.out.println(bank.name+"  "+bank.getCredit_limit());

        Customer mani_bank = new Customer("mani",100000,"nneelinihal@");
        System.out.println(mani_bank.name+"  "+mani_bank.getCredit_limit());
        System.out.println(mani_bank.getEmail());

    }
}
