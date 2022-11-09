import java.util.Scanner;

public class Main_Button {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("print");

    public static void main(String[] args) {
//        class ClickListner implements Button.OnClickListner{
//            public ClickListner(){
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onclick(String title) {
//                System.out.println(title+" was clicked");
//            }
//        }
//        btnPrint.setOnClickListner(new ClickListner());
//        Listen();
//

        btnPrint.setOnClickListner(new Button.OnClickListner() {
            @Override
            public void onclick(String title) {
                System.out.println(title+ " was clicked");
            }
        });
        Listen();
    }

    private static void Listen(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
