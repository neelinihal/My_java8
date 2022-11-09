public class Convert_String_into_Number {
    public static void main(String[] args) {
        String numasString = "2018";
        System.out.println("numasString = "+numasString);
        int number = Integer.parseInt(numasString);
        System.out.println("number = "+number);
        numasString += 1;
        number += 1;
        System.out.println("numasString = "+numasString);
        System.out.println("number = "+number);


        String numString = "2018.4748";
        System.out.println("numString = "+numString);
        double num = Double.parseDouble(numString);
        System.out.println("num = "+num);
        numString += 1;
        num += 1;
        System.out.println("numString = "+numString);
        System.out.println("num = "+num);
    }
}
