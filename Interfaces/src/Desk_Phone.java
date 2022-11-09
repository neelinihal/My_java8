public class Desk_Phone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public Desk_Phone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dail(int phoneNumber) {
        System.out.println("Now ringing "+phoneNumber+" on deskPhone");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (myNumber == phoneNumber){
            isRinging = true;
            System.out.println("Ring Ring");
        }
        else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
