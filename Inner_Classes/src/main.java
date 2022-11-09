public class main {
    public static void main(String[] args) {
        Gear_Box altroz = new Gear_Box(6);
//        altroz.addGear(1,5.3);
//        altroz.addGear(2,10.6);
//        altroz.addGear(3,15.9);
        altroz.operateClutch(true);
        altroz.changeGear(1);
        altroz.operateClutch(false);
        System.out.println(altroz.wheelSpeed(1000));
        altroz.changeGear(2);
        System.out.println(altroz.wheelSpeed(3000));
        altroz.operateClutch(true);
        altroz.changeGear(3);
        System.out.println(altroz.wheelSpeed(6000));


        Gear_Box.Gear first = altroz.new Gear(1,12.3);

        System.out.println(first.driveSpeed(1000));

    }
}
