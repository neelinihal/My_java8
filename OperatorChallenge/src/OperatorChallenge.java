public class OperatorChallenge {
    public static void main(String [] args) {

     double a = 20.00;
     double b = 80.00;
     double c = (a + b) * 100.00;
     double d = c%40;
     System.out.println("the value is "+c);
     System.out.println("reminder is "+d);

     boolean e = ( d == 0) ?true :false;
        System.out.println(e);

     if (!e) {
         System.out.println("Got some remainder");
     }
    }

}
