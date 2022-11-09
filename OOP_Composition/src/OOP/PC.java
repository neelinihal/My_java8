package OOP;

public class PC {
    private Case theCase;
    private Mother_board mother_board;
    private Moniter moniter;

    public PC(Case theCase, Mother_board mother_board, Moniter moniter) {
        this.theCase = theCase;
        this.mother_board = mother_board;
        this.moniter = moniter;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Mother_board getMother_board() {
        return mother_board;
    }

    public Moniter getMoniter() {
        return moniter;
    }

    //OR

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
        mother();
    }
    public void drawLogo(){
        moniter.drawPixelAT(5,10,"blue");
    }
    public void mother(){
        mother_board.loadProgram("windows 10");
    }
}
