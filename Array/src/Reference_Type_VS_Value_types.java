import java.util.Arrays;

public class Reference_Type_VS_Value_types {
    public static void main(String [] args){
        int num = 5;
        int anotherNum = num;
        System.out.println("num = "+num);
        System.out.println("anotherNum = "+anotherNum);

        anotherNum++;

        System.out.println("num = "+num);
        System.out.println("anotherNum = "+anotherNum);

        int[] integer = new int[5];
        int[] anotherInteger = integer;
        System.out.println("integer = "+ Arrays.toString(integer));
        System.out.println("another = "+Arrays.toString(anotherInteger));

        anotherInteger[0] = 1;
        System.out.println("integer = "+ Arrays.toString(integer));
        System.out.println("another = "+Arrays.toString(anotherInteger));


        anotherInt(integer);
        System.out.println("integer = "+ Arrays.toString(integer));
        System.out.println("another = "+Arrays.toString(anotherInteger));

        anotherInteger = new int[]{4,5,6,1,2};   //here we used new keyword so it changed the values
        anotherInt(integer);
        System.out.println("integer = "+ Arrays.toString(integer));
        System.out.println("another = "+Arrays.toString(anotherInteger));
    }

    protected static void anotherInt(int[] array){
        array[0] = 2;
    }
}
