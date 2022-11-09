package OOP;

public class Main_BAnk {
    public static void main(String[] args) {
        Bank_Account bank= new Bank_Account();
        System.out.println(bank.getAccount_number());
        System.out.println(bank.getBalance());

        bank.deposit(500);
        bank.withdraw(1700);

        Bank_Account NIHAL_BANK = new Bank_Account("mani","neelinihal@",6302);
        System.out.println(bank.balance +"  "+ NIHAL_BANK.Customer_Name);
    }
}
