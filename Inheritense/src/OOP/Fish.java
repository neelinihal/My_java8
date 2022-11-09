package OOP;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, size, 1, 1, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest(){
        System.out.println("fish will take rest");
    }
    private void moveMuscles(){
        System.out.println("moveMuscles is called");
        super.move(90);
    }
    private void moveBackFin(){
        System.out.println("moveBackFin() called");
        move(70);
    }
    public void swim(){
        moveBackFin();
        moveMuscles();
        super.move(30);
    }
}
