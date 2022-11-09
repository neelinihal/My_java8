public class Main {
    public static void main(String[] args) {
        ITelephone maniPhone = new Desk_Phone(99080);
        maniPhone.powerOn();
        maniPhone.callPhone(99080);
        maniPhone.answer();
        maniPhone.callPhone(99080);
        maniPhone.isRinging();

        ITelephone mobile_phone = new Mobile_Phone(99080);
        mobile_phone.powerOn();
        mobile_phone.callPhone(99080);
        mobile_phone.answer();
    }
}
