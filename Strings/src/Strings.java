public class Strings {
    public static void main(String[] args) {

        String mystring = "this is a string";
        System.out.println("this is also a string " + mystring);
        mystring = mystring + " the stirng";
        System.out.println("this is also a string " + mystring);
        int num = 5;
        String numm = "4";
        System.out.println(num + numm);    //integer is converted into the string and 4 is appended to 5


        int nnum = 3;
        int numo = 4;
        int result = nnum + numo;

        System.out.println(result);
        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        result += 5;
        System.out.println(result);

        result *= 10;
        System.out.println(result);

        result -= 100;
        System.out.println(result);

    }

}

