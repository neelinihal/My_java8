public class MethodOverloadingChallenge {
    public static void main(String[] args) {

        double centimeter = calcFeetAndInchesToCentimeters(6,0);
        if (centimeter<0.0){
            System.out.println("invalid parameters");
        }


        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet,double inches){

        double centimeters = feet*12*2.54 + inches*2.54;
        //        centimeters+= inches*2.54;

        if (feet < 0 || (inches < 0 && inches >12)) {
            System.out.println("invalid feet and inches ");
            return -1;
        }
        else {
            System.out.println(feet + "feet " +inches + " inches  = " +centimeters + " cm");
            return centimeters;
        }
    }



    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0) {
            return -1;
        }
        else {
            double feet = (int) inches/12;
            double RemaningInches = (int)inches%12;
            System.out.println(inches + " inches = " +feet+ " feet and " + RemaningInches + "inches");
            return calcFeetAndInchesToCentimeters(feet,RemaningInches);
        }
    }
}
