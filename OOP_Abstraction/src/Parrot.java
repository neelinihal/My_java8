public class Parrot extends Bird{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void breathe() {
        super.breathe();
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flying");
    }
}
