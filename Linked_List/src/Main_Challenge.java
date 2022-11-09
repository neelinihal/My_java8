import java.util.*;

public class Main_Challenge {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
        Album album = new Album("StormBringer","Deep Purple");
        LinkedList Sri = new LinkedList<>();
        album.addSong("DSP",2.34);
        album.addSong("MIC",3.54);
        album.addSong("Sid",5.24);
        albums.add(album);

        album = new Album("for those about to rock","AC/DC");
        album.addSong("lets go",3.5);
        album.addSong("on my way",2.5);
        album.addSong("C.O.D",5.24);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("MIC",playList);
        albums.get(0).addToPlayList("Sid",playList);
        albums.get(0).addToPlayList("Ram",playList);
        albums.get(0).addToPlayList("DSP",playList);
        albums.get(0).addToPlayList(2,playList);

        play(playList);

    }
    private static void play(LinkedList<Song> playList){
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0){
            System.out.println("No songs in playList");
        }else {
            System.out.println("Now playing "+listIterator.next().toString());
            printMenu();
        }

        while (!quit){
            int num = scanner.nextInt();
            scanner.nextLine();
            switch (num){
                case 0:
                    System.out.println("PlayList complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing "+listIterator.next().toString());
                    }else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous().toString());
                    }else {
                        System.out.println("we are at the top of the list");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            System.out.println("Now playing "+listIterator.previous().toString());
                            forward = false;
                        }else {
                            System.out.println("we are at the last of the list");
                        }
                    }else {
                        if (!forward){
                            if (listIterator.hasNext()){
                                System.out.println("now playing "+listIterator.next().toString());
                                forward = true;
                            }else {
                                System.out.println("we are at the last of the list");
                            }
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    if (playList.size()>0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("now playing "+listIterator.next());
                        }else if (listIterator.hasPrevious()){
                            System.out.println("now playing "+listIterator.previous());
                        }
                    }
                    break;
                case 6:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions: \npress");
        System.out.println("0 - to quit \n"+
                "1 - to play next song \n"+
                "2 - to play previous song\n"+
                "3 - to replay the current song\n"+
                "4 - list of songs in the playList\n"+
                "5 - to remove song from the list\n"+
                "6 - print available actions");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> songIterator = playList.iterator();
        System.out.println("=========================");
//        for (int i = 0; i < playList.size(); i++) {
//            System.out.println(playList.get(i).toString());
//        } (OR)
        while (songIterator.hasNext()){
            System.out.println(songIterator.next().toString());
        }
        System.out.println("=========================");
    }
}
