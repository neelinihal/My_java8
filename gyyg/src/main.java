public class main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            books books = randomBook();
            System.out.println("name of book is "+books.getName()+"\n"+" number of pages are "+books.pages()+"\n");
        }
    }
    public static books randomBook(){
        int random = (int)(Math.random()*2+1);
        if(random == 1){
            return new nim();
        }
        if(random == 2){
            return new mic();
        }
        else {
            return null;
        }
    }
}
