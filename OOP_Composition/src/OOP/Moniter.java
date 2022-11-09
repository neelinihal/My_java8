package OOP;

public class Moniter {
    private String model;
    private String manufacture;
    private int size;
    private Resolution resolution;

    public Moniter(String model, String manufacture, int size, Resolution resolution) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.resolution = resolution;
    }
    public void drawPixelAT(int x,int y,String colour){
        System.out.println("Drawing pixel "+x+","+y+","+ " in colour "+colour);
    }
    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
