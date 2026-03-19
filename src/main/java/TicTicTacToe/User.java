package TicTicTacToe;

public class User {
    private final int id;
    private final int symbolToPlay;

    private boolean turnToPlay;

    public User(int id, int symbolToPlay) {
        this.id = id;
        this.symbolToPlay = symbolToPlay;
        this.turnToPlay = false;
    }

    public int getId() {
        return id;
    }

    public int getSymbolToPlay() {
        return symbolToPlay;
    }

    public boolean isTurnToPlay(boolean turn) {
        return turnToPlay;
    }

    public void setTurnToPlay(boolean turnToPlay) {
        this.turnToPlay = turnToPlay;
    }
}
