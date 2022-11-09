import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName,int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A'+(numRows-1);
        for (char row = 'A'; row <=lastRow; row++){
            for (int seatNum = 1;seatNum <=lastRow;seatNum++){
                Seat seat = new Seat(row+String.format("%d",seatNum));
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

     public boolean reserveSeats(String seatNumber){
        Seat requestedSeat = null;
        for (Seat seat : seats){
            if (seat.getSeatNumber().equals(seatNumber)){
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat ==null){
            System.out.println("there is no "+seatNumber);
            return false;
        }
        return requestedSeat.reserve();
     }

     //for testing
    public void getSeats(){
        for (Seat seat: seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve(){
            if (this.reserved){
                this.reserved = true;
                System.out.println("Seat "+seatNumber+" reserved");
                return true;
            }else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
