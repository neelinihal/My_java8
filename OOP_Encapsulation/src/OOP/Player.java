package OOP;

public class Player {
    public String name;
    public int hitPoints;
    public String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        if(health >0 && health<=100){
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }
    public void remanigHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <=0){
            System.out.println("player is knocked out");
        }
    }
    public int getHealth() {
        return hitPoints;
    }
}
