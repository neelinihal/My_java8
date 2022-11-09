package HOUSE;

public class Gadzets {
    public int speakers;
    public int phones;
    public String colour;

    public Gadzets(int speakers, int phones, String colour) {
        this.speakers = speakers;
        this.phones = phones;
        this.colour = colour;
    }

    public void totalGadzets(){
        System.out.println("they uses these gadzets "+speakers+" speakers, "+phones+" phones"+" and painted with "+colour+" colour");
    }

    public int getSpeakers() {
        return speakers;
    }

    public int getPhones() {
        return phones;
    }

    public String getColour() {
        return colour;
    }
}
