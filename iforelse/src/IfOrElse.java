public class IfOrElse {

    public static void main(String[] args) {

        boolean army = false;
        if (army == false)
            System.out.println("yes it is correct");


        boolean mani = true;
        if (mani == true) {
            System.out.println("iam mani");
            System.out.println("my name is mani");
        }


        boolean iscar = false;
        if (!iscar){
            System.out.println("!=it is a not operator");
        }


        int marks = 100;
        if (marks != 100)   //!= =not equal //>= graeater than equal //<= leass than equal
            System.out.println("yes he got 100 marks");


        int money = 60;
        if (marks > 80 && money == 60 ) {             // and(&&) operator is used both condition should follow)
            System.out.println("yes marks and money are same");
        }


        if (marks >=11111 || money ==60) {           // or(||) operator is used(anyone of this condition should follow)
            System.out.println("yes marks or money are same");
        }

        int in = 40;
        boolean mac = in == 50? true:false ;
        if (mac){
            System.out.println("in the write");
        }
    }
}
