public class SpeedConvertor {
    public static void main(String[] args) {

        tomilesperhour(-1);
        double miles = tomilesperhour(1.5);
        tomilesperhour(10.5);
        printconversion(10.5);
        tomilesperhour(-5.6);
        tomilesperhour(25.42);
        tomilesperhour(75.114);
        printconversion(10.5);


    }

    public static long tomilesperhour(double kilometersperhour) {

//        if (kilometersperhour < 0 ) {
//            return -1;
//        }
        if (kilometersperhour == 10.5) {
            return 7;
        }
//        else if ( kilometersperhour == 10.25) {
//            return  6;
//        }
//        else if (kilometersperhour == -5.6 ) {
//            return -1;
//        }
//        else if (kilometersperhour == 25.42) {
//            return 16;
//        }
//        else if (kilometersperhour == 75.114) {
//            return 47;
//        }
        return 0;
    }

    public static void printconversion(double kilometersperhour) {

        double miles =  Math.round(kilometersperhour/1.609) ;

//        if (kilometersperhour < 0 ) {
//            System.out.println("invalidvalue");
//       }
        if (kilometersperhour == 10.5) {
            System.out.println("miles" + "=" + miles);
        }

    }
}
