package OOP;

public class Car {
    private int doors;
    private int wheels;
    public String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String Validmodel = model.toLowerCase();
        if (Validmodel.equals("x1")||Validmodel.equals("x5")){
            this.model = model;
        }
        else {
            this.model = "Invalid";
        }
    }
    public String getModel(){
        return this.model;
    }
}