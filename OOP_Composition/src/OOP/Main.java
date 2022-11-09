package OOP;

public class Main {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(30,20);
        Moniter moniter = new Moniter("aspire 7","acer",30,resolution);

        Mother_board mother_board = new Mother_board("S26","mi",2,5,"v2.56");

        Case theCase = new Case("A7","Samsung","30V",new Dimensions(5,10,3));

        PC pc = new PC(theCase,mother_board,moniter);
        pc.getTheCase().pressPowerButton();
        pc.getMoniter().drawPixelAT(5,6,"black");
        pc.getMother_board().loadProgram("windows 10");

        System.out.println("************************************************************");
        pc.powerUp();
    }
}