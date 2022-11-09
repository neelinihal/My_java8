public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("nick");
        dog.breathe();
        dog.eat();

        Parrot macaw = new Parrot("Macaw");
        macaw.eat();
        macaw.breathe();
        macaw.fly();

        Penguin penguin = new Penguin("larse");
        penguin.eat();
        penguin.breathe();
        penguin.fly();
    }
}
