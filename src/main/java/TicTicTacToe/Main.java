package TicTicTacToe;

public class Main {
    public static void main(String[] args) {

        GameManager gameManager=new GameManager(new GameBoard(3,3));
        gameManager.addUserToGame(new User(1,1));
        gameManager.addUserToGame(new User(2,0));
        gameManager.StartGame();

    }
}
