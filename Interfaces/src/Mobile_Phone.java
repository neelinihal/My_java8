public class Mobile_Phone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public Mobile_Phone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone is powered up");
    }

    @Override
    public void dail(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on deskPhone");
        }
        else {
            System.out.println("Mobile phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the Mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (myNumber == phoneNumber&& isOn){
            isRinging = true;
            System.out.println("Melody Ring");
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
