import java.util.ArrayList;

public class Mainn {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            integerArrayList.add(Integer.valueOf(i));  //AUTO BOXING
        }
        for (int i = 0; i <=10 ; i++) {
            System.out.println(i+"-->"+integerArrayList.get(i).intValue());   //UNBOXING
        }

        Integer myIntValue = 53;  //or Integer.valueOf(53);
        int myInt = myIntValue;   //or myInt.intValue();

        ArrayList<Double> doubles = new ArrayList<Double>();
        for (double j = 0.0 ;j<=10.00;j+=0.5){
            doubles.add(j);
        }

        for (int i = 0 ; i < doubles.size(); i++) {
            double myDouble = doubles.get(i);
            System.out.println(i+"  -->  "+doubles.get(i).doubleValue() );
        }
    }
}
