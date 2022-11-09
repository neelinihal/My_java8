package OOP;

public class Main {
    public static void main(String[] args) {
        Car bmw = new  Car();
        Car porsche = new Car();

        bmw.setModel("X1");
        System.out.println("the BMW model is "+bmw.getModel());
    }
}
