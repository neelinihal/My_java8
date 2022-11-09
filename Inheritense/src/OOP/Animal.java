package OOP;

public  class Animal {

     private String name;
     private int size;
     private int body;
     private int brain;
     private int weight;

    public Animal(String name, int size, int body, int brain, int weight) {
        this.name = name;
        this.size = size;
        this.body = body;
        this.brain = brain;
        this.weight = weight;
    }

    public Animal(String name) {
        this.name = name;
    }
    public void names(){
        System.out.println(name);
    }

    public void eat(){
        System.out.println("Animals.eat called");
    }
    public void move(int speed){
        System.out.println("Animal moving at "+speed);
    }

    public String getName(){
        return name;
    }
    public int getSize() {
        return size;
    }

    public int getBody() {
        return body;
    }

    public int getBrain() {
        return brain;
    }

    public int getWeight() {
        return weight;
    }
}

