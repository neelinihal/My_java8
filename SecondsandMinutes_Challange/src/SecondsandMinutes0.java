public class SecondsandMinutes0 {

    private static String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {

        String hi = getDurationString(489,50);   //or System.out.println(getDurationString(500,50));
        System.out.println(hi);

        System.out.println(getDurationString(500));

    }

    private static String getDurationString(int minutes,int seconds) {

        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {

            int hours = minutes / 60;
            int remaningmin = minutes % 60;



            String hoursString =  hours +"h";
            if (hours < 10){
                hoursString = "0" +hours;
            }


            String minutesString =  remaningmin +"min";

            if (remaningmin < 10){
                minutesString = "0" +remaningmin;
            }



            String secondsString =  seconds +"s";

            if (seconds < 10){
                secondsString = "0" +seconds;
            }


            return hoursString + "h " + minutesString + "m " + secondsString + " ";

        } else {
            return INVALID_VALUE_MESSAGE;
        }


    }
    private static String getDurationString(int seconds) {

        if (seconds < 0 ){
            return INVALID_VALUE_MESSAGE;
        }
        else {
            int minute = seconds/60;
            int remaningseconds = seconds%60;

            String minString = minute + "min";
            if (minute < 10) {
                minString = "0" +minute;
            }


            String secondsString =  remaningseconds +"sec";

            if (remaningseconds < 10){
                secondsString = "0" +remaningseconds;
            }


            System.out.println( minString+ "m " + secondsString + "s");    //we can write both in minutes and in hours

            return getDurationString(minute,remaningseconds);
        }
    }

}

