public class While_Challenge {
    public static void main(String[] args) {

       int num = 4;

       while (num <=20){
           num++;
           if (!isEvenNumber(num)){
                continue;
           }
               System.out.println("it is even = " +num);
       }
       do{
           num++;
           if (!isEvenNumber(num)){
               continue;
           }
           System.out.println("even " + num);
       }while (num <= 20);
    }

    public static boolean isEvenNumber(int num) {
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
