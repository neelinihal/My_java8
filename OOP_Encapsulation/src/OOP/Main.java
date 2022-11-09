package OOP;

public class Main {
    public static void main(String[] args) {
       Player player = new Player("mani",50,"m416");
        System.out.println("initial health is "+player.getHealth());
        player.remanigHealth(25);
        System.out.println("total health after damage is "+player.getHealth());
    }
}
