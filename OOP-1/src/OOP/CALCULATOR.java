package OOP;

public class CALCULATOR {
    public static void main(String[] args) {
        Simple_Calculator Calculator = new Simple_Calculator();
        Calculator.firstnumber = 4;
        Calculator.secondnumber = 2;
        System.out.println("addition = "+Calculator.getAdditionResult());
        System.out.println("Subtract = "+Calculator.getsubResult());
        System.out.println("Multiplication = "+Calculator.getMultResult());
        System.out.println("Divide = "+Calculator.getdiviResult());
    }
}