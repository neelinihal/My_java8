import java.util.Scanner;

public class Modify_Array {
    public static Scanner scanner = new Scanner(System.in);
    static int [] baseData = new int[10];

    public static void main(String[] args) {
        getInput();
        printNum(baseData);
        resieArray();
        getInput();
        baseData[11] = 55;
        baseData[12] = 59;
        printNum(baseData);

    }
    private static void getInput(){
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = scanner.nextInt();
        }
    }

    public static void printNum(int[] array){
        for (int i = 0; i < baseData.length; i++) {
            System.out.println(array[i]+" ");
        }
    }
    public static void resieArray(){
        int[] original = baseData;
        baseData = new int[12];
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = scanner.nextInt();
        }
    }
}
