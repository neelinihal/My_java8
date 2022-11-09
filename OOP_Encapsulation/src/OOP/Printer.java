package OOP;

public class Printer {
    public int toner_level;
    public int number_of_pages;
    public boolean duplex_printer;

    public Printer(int toner_level, boolean duplex_printer) {
        if(toner_level>-1 && toner_level<=100){
            this.toner_level = toner_level;
        }
        else {
            this.toner_level = -1;
        }
        this.toner_level = toner_level;
        this.number_of_pages = number_of_pages;
        this.duplex_printer = duplex_printer;
    }
    public void toner(){
        this.duplex_printer = duplex_printer;

    }

    public boolean isDuplex_printer() {
        return duplex_printer;
    }
}
