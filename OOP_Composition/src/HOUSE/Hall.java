package HOUSE;

public class Hall {
    public int fans;
    public int chairs;
    public int photos;
    public Gadzets gadzets;

    public Hall(int fans, int chairs, int photos, Gadzets gadzets) {
        this.fans = fans;
        this.chairs = chairs;
        this.photos = photos;
        this.gadzets = gadzets;
    }

    public void inHall(int members,String movie){
        System.out.println("there are total "+members+" in hall. they will see "+movie+" movie");
    }

    public int getFans() {
        return fans;
    }

    public int getChairs() {
        return chairs;
    }

    public int getPhotos() {
        return photos;
    }

    public Gadzets getGadzets() {
        return gadzets;
    }
}
