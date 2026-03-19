package TicTicTacToe;


public class GameManager {
    private GameBoardInterface gameBoardInterface;

    public GameManager(GameBoard gameBoard) {
        this.gameBoardInterface = gameBoard;
    }

    public void addUserToGame(User user){
        gameBoardInterface.addUsersToGame(user);
    }

    public void printBoard(){
        gameBoardInterface.printBoard();
    }


    public void StartGame(){
        gameBoardInterface.startGame();
    }
}
