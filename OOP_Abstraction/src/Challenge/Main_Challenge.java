package Challenge;

public class Main_Challenge {
    public static void main(String[] args) {
        MyLinked_List list = new MyLinked_List(null);
        list.tranverse(list.getRoot());

        String stringData = "5 7 9 8 4 0  1 6 5 4 2 ";

        String[] data = stringData.split(" ");
       for (String s : data){
           list.addItem(new Node(s));
       }
       list.tranverse(list.getRoot());
        System.out.println("======================");


       list.removeItem(new Node("2"));
        list.tranverse(list.getRoot());
    }
}
