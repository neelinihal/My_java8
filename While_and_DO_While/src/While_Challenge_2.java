public class While_Challenge_2 {
    public static void main(String[] args) {

        int num = 4;
        int count = 0;
        int addofnum = 0;

        while (num <= 20) {
            num++;
            if (!isEvenNumber(num)) {
                continue;
            }
            System.out.println("it is even = " + num);
            count++;
            addofnum += num;
            if (count>=5){
                break;
            }
        }
        System.out.println("addition of total = "+addofnum);
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
