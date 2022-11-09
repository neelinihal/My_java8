package HOUSE;

public class HOUSE {
    private Hall hall;
    private BedRoom bedRoom;

    public HOUSE(Hall hall, BedRoom bedRoom) {
        this.hall = hall;
        this.bedRoom = bedRoom;
    }
    public void house(){
        System.out.println("this is our house");
    }

    public Hall getHall() {
        return hall;
    }

    public BedRoom getBedRoom() {
        return bedRoom;
    }
}
