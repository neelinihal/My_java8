public class Switch_Challenge {
    public static void main(String[] args) {

        char SwitchCharValue  = 'D';

        switch (SwitchCharValue ) {

            case 'A':
                System.out.println("char is A");
                break;
            case 'B':
                System.out.println("char is B");
                break;
            case 'C':
                System.out.println("char is C");
                break;
            case 'D': case 'E':
                System.out.println("It is either D or E");
                System.out.println("Char is " + SwitchCharValue);
                break;
            default:
                System.out.println("No char");
        }


        String month = "JaNuaRy";

        switch (month.toLowerCase()) {                    //converts into lowerwords
            case  "january" :
                System.out.println("jan");
                break;
            case "may" :
                System.out.println("may");
                break;
            default:
                System.out.println("Nothing");
        }
    }
}
