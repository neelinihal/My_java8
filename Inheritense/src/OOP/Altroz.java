package OOP;

public class Altroz extends Car{
    private int roadServiceMonths;

    public Altroz( int roadServiceMonths) {
        super("Altroz", "4Bench", 4, 4, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity()+rate;
        if(newVelocity == 0){
            stop();
        } else if (newVelocity >0 && newVelocity <=10) {
            ChangeGear(1);
        }else if (newVelocity >0 && newVelocity <=10) {
            ChangeGear(2);

        }else if (newVelocity >10 && newVelocity <=30) {
            ChangeGear(3);
        }
        else if (newVelocity >30 && newVelocity <=50) {
            ChangeGear(4);
        }else{
            ChangeGear(5);
        }
    }
}
