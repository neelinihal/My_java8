package OOP;

public class Simple_Calculator {
    public double firstnumber ;
    public double secondnumber;
//    public double AdditionResult;
//    public double SubResult;
//    public double MultResult;
//    public double DiviResult;


    public void setFirstnumber(double firstnumber){
        this.firstnumber = firstnumber;
    }
    public void setSecondnumber(double secondnumber){
        this.secondnumber = secondnumber;
    }

    public double getAdditionResult(){
        return firstnumber+secondnumber;
    }

    public double getsubResult(){
        return firstnumber-secondnumber;
    }

    public double getdiviResult(){
        return firstnumber/secondnumber;
    }

    public double getMultResult(){
        return firstnumber*secondnumber;
    }
}