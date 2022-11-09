public class Switch_Statement {
    public static void main(String[] args) {

//        int ifvalue = 2;
//
//        if (ifvalue == 1) {
//            System.out.println("value is 1");
//        }
//        else if (ifvalue == 2 ) {
//            System.out.println("value is 2");
//            System.out.println("it was a "+ifvalue);
//        }
//        else {
//            System.out.println("neither 1 nor 2");
//        }



// we can choose anyone either IF or SWITCH as per our convinient


        int switchvalue = 4;

        switch (switchvalue) {
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3:  case 4: case 5:
                System.out.println("its 3 or 4 or 5");
                System.out.println("It was a " + switchvalue);
                break;
            default:
                System.out.println("neither 1 nor 2");
                break;
        }
    }
}
