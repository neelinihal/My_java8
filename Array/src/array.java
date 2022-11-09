public class array {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[0] = 10;
        myIntArray[1] = 20;
        myIntArray[5] = 200;
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[5]);

        int[] myAnotherIntVariable = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(myAnotherIntVariable[0]);
        System.out.println(myAnotherIntVariable[5]);

        int[] variable = new int[10];
        for (int i = 0; i < variable.length; i++) {
            variable[i] = i * 10;
        }
        for (int i = 0; i < variable.length; i++) {
            System.out.println("Element " + i + " value is " + variable[i]);
        }



        //IN METHODS
        int[] myVariable = new int[10];
        for (int i = 0; i < myVariable.length; i++) {
            myVariable[i] = i * 10;
        }
        printArray(myVariable);
    }
        public static void printArray(int[] array){
            for (int i = 0; i < array.length; i++) {
                System.out.println("Element " + i + " value is " + array[i]);
            }
        }
}
