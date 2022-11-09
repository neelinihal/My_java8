package acedamey.learn;

public class byteint {
    public static void main(String [] args){

        int mynumber = 100;    // interger is written as same to number
        int nu = Integer.MAX_VALUE;
        int nujm = Integer.MIN_VALUE;
        System.out.println("max is = "+nu);
        System.out.println("max is = "+nujm);
        System.out.println("busted value is =" +nu +1);
        System.out.println("busted value is =" +nujm + 1);


        byte imp = Byte.MAX_VALUE;
        byte impp = Byte.MIN_VALUE;
        System.out.println("the max Byte value is =" + imp);
        System.out.println("the min byte value is ="+ impp);


        short imm = Short.MAX_VALUE;
        short immp = Short.MIN_VALUE;
        System.out.println("the max Short value is =" + imm );
        System.out.println("the min Short value is ="+ immp);

        long mylongvalue = 100L;      //long as writen as 100L
        long imo = Long.MAX_VALUE;
        long imop = Long.MIN_VALUE;
        System.out.println("the max Long value is =" + imo );
        System.out.println("the min Long value is ="+ imop);
        System.out.println(mylongvalue);


        int myvalue = (nujm/ 2);
        System.out.println(myvalue);

        byte myvaluee = (byte) (imp/2);
        System.out.println((myvaluee));

        long myvalueee = (long) (imo/2);
        System.out.println(myvalueee);

        short myvalu = (short) (impp);
        System.out.println(myvalu);

        
    }
}


