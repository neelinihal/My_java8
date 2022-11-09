public class While {
    public static void main(String[] args) {
        int count = 0;
        while (count !=6){
            System.out.println("count value is = " + count);
            count++;
        }


//        for (count = 0; count <= 5; count++) {
//
//            System.out.println("count value  = "+count);
//        }

        count =0;
        while (true){
            if (count == 6){
                break;
            }
            System.out.println("count value is = " + count);
            count++;
        }



        count =0;
        do {
            System.out.println(" count value was = " + count);
            count++;
        }while (count!=6);

    }
}
