import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("tim",54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.8);
        System.out.println("balance of the "+customer.getName()+" is "+customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i+": "+intList.get(i));
        }

        intList.add(3,5);
        intList.remove(0);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i+" :"+intList.get(i));
        }
    }
}
