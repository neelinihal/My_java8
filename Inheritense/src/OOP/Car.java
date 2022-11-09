package OOP;

public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }
    public void ChangeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear (): Changed to "+this.currentGear+" gear");
    }
    public void ChangeVelocity(int speed,int direction){
        move(speed,direction);
        System.out.println("Car.ChangeVelocity() : Velocity "+speed+" direction "+direction);
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
