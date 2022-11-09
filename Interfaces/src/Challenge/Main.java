package Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
         Player mani = new Player("mani",10,15);
        System.out.println(mani.toString());
        saveObject(mani);

        mani.setHitPoints(8);
        System.out.println(mani);
        mani.setWeapon("AKM");
        saveObject(mani);
        loadObject(mani);
        System.out.println(mani);

        ISaveable wereWolf = new Monster("wereWolf",40,100);
        System.out.println(((Monster)wereWolf).getName());
        System.out.println(wereWolf);
        saveObject(wereWolf);
    }
    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();
        boolean quit = false;
        int index = 0;
        System.out.println("choose\n"+
                "1 to enter a string\n"+
                "0 to quit");
        while (!quit){
            System.out.println("Choose a option");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
    public static void saveObject(ISaveable objectToSave){
        for (int i = 0; i<objectToSave.write().size();i++){
            System.out.println("saving "+objectToSave.write().get(i)+" to the storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
