package HOUSE;

public class BedRoom {
    public int rooms;
    public int cupboards;
    public String colour;

    public BedRoom(int rooms, int cupboards, String colour) {
        this.rooms = rooms;
        this.cupboards = cupboards;
        this.colour = colour;
    }
    public void totalbed(){
        System.out.println("this is our bedroom contains "+rooms+" room "+cupboards+" cupboards "+colour+" colour");
    }

    public int getRooms() {
        return rooms;
    }

    public int getCupboards() {
        return cupboards;
    }

    public String getColour() {
        return colour;
    }
}
