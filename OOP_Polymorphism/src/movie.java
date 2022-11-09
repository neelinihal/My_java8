public class movie {
    public String name;

    public movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "no plot here";
    }

    public String getName() {
        return name;
    }
}
class Jaws extends movie{
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A Shark eats lot of people";
    }
}
class IndependenceDay extends movie{
    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens attempts to take over planet";
    }
}
class mazeRunner extends movie{
    public mazeRunner() {
        super("mazeRunner");
    }

    @Override
    public String plot() {
        return "Kids try and escape the maze";
    }
}
class starWars extends movie{
    public starWars() {
        super("star wars");
    }

    @Override
    public String plot() {
        return "Imperial force try to take the universe";
    }
}
class Forgettable extends movie{
    public Forgettable() {
        super("Forgettable");
    }
    // no plot method
}