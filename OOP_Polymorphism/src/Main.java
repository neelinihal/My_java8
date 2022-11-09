public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            movie movie = randomMovie();
            System.out.println("movie #"+i+" : "+movie.getName()+"\n"+"plot: "+movie.plot()+"\n");
        }
//     or   int i=1;
//        while (true){
//            movie movie = randomMovie();
//            System.out.println("movie #"+i+" : "+movie.getName()+"\n"+"plot: "+movie.plot()+"\n");
//            i++;
//            if (i==10){
//                break;
//            }
//        }
    }
    public static movie randomMovie(){
        int randomNumber = (int) (Math.random() *5 +1 );
        System.out.println("The random number is "+randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new mazeRunner();
            case 4:
                return new starWars();
            case 5:
                return new Forgettable();
        }
        return null;
    }
}
