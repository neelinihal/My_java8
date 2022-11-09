package HOUSE;

public class Main {
    public static void main(String[] args) {
        Hall hall = new Hall(2,6,10,new Gadzets(5,3,"lite blue"));
        BedRoom bedRoom = new BedRoom(1,3,"pink");

        HOUSE house = new HOUSE(hall,bedRoom);
        house.house();
        house.getHall().inHall(4,"Don");
        house.getBedRoom().totalbed();
    }
}
