package acedamy;

public class FloatDouble {

    public static void main(String[] args){

        float hii = Float.MIN_VALUE;
        float hi = Float.MAX_VALUE;

        System.out.println("Min value of float =" + hii);
        System.out.println("Max value of float =" + hi);

        Double hoo = Double.MIN_VALUE;
        Double ho = Double.MAX_VALUE;

        System.out.println("Min value of Double =" + hoo);
        System.out.println("Max value of Double =" + ho);

        int myint = 5 / 2 ;
        float myfloat = 5f / 3f;  // or (float) 5
        double mydouble = 5d / 3d;  // or (double) 5 // or 5.00
        System.out.println("myintvalue = "+myint);
        System.out.println("myfloat = "+myfloat);
        System.out.println("mydouble ="+mydouble);

    }
}
