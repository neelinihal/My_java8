package OOP;

public class Main_Animal {
    public static void main(String[] args) {
        Animal animal = new Animal("mammu",1,1,1,20);
        Animal cat = new Animal("mammu");
        cat.names();
//        animal.eat();

        Dog dog = new Dog("mammu",1,30,2,4,1,20,"leather coat");
//        dog.eat();
//        dog.walk();
//        dog.run();

       Fish fish = new Fish("mammu",20,5,2,2,4);

       fish.swim();
    }
}
