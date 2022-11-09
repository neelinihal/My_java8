package OOP;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat){
       super(name,size,1,1, weight);
       this.eyes = eyes;
       this.legs = legs;
       this.tail = tail;
       this.teeth = teeth;
       this.coat = coat;
   }
   private void chew(){
       System.out.println("dog.eat called");
   }

    @Override
    public void eat() {
        System.out.println("Dog.eat called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() is called");
        move(5);     //here super.move call only another class
    }
    public void run(){
        System.out.println("dog.run() is called");
        super.move(10);         // here we don't use super so it calls another class and move added in this class
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        super.move(20);
    }
}
