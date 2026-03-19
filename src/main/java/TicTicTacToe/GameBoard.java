package TicTicTacToe;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class GameBoard implements GameBoardInterface{

    Queue<User> userQueue;
    int[][] gameBoard;

    public GameBoard(int row, int col) {
        this.gameBoard=new int[row][col];
        this.userQueue=new ArrayDeque<>();
        initiazileArray(gameBoard);
    }

    private void initiazileArray(int[][] gameBoard) {
        for (int i=0;i< gameBoard.length;i++){
            for(int j=0;j< gameBoard.length;j++){
                gameBoard[i][j]=-1;
            }
        }
    }


    @Override
    public void printBoard() {
        for(int i=0;i<gameBoard.length;i++){
            System.out.print("| ");
            for(int j=0;j< gameBoard[i].length;j++){
                System.out.print(gameBoard[i][j]+" |");
            }
            System.out.println();
        }
    }

    @Override
    public void addUsersToGame(User user) {
        userQueue.add(user);
    }


    @Override
    public void startGame() {
        Scanner sc = new Scanner(System.in);
        // Jab tak players hain game chalega
        while(userQueue.size() >= 2) {
            User user = userQueue.poll(); // Current player ko nikala
            int symbol = user.getSymbolToPlay();

            System.out.println("User " + user.getId() + " turn. Enter row and col:");
            int row = sc.nextInt();
            int col = sc.nextInt();

            // Validate
            if (row >= 0 && row < gameBoard.length && col >= 0 && col < gameBoard[0].length && gameBoard[row][col] == -1) {

                gameBoard[row][col] = symbol; // Update
                printBoard(); // Print updated board

                if(checkUserWin(gameBoard, user)) {
                    System.out.println("User with id " + user.getId() + " won!");
                    return; // Game Over
                }

                // IMPORTANT: Move successful, current user ko queue ke piche bhejo
                userQueue.add(user);

            } else {
                System.out.println("Invalid move! Try again.");
                // Invalid move pe user ko vapas sabse aage dalo (ya poll na karo)
                ((ArrayDeque<User>)userQueue).addFirst(user);
            }
        }
    }

    private boolean checkUserWin(int[][] gameBoard, User user) {
        int s = user.getSymbolToPlay();
        int n = gameBoard.length;

        for (int i = 0; i < n; i++) {
            // Row check: Kya puri row mein wahi symbol hai?
            if (gameBoard[i][0] == s && gameBoard[i][1] == s && gameBoard[i][2] == s) return true;

            // Col check: Kya pure column mein wahi symbol hai?
            if (gameBoard[0][i] == s && gameBoard[1][i] == s && gameBoard[2][i] == s) return true;
        }

        // Diagonal checks
        if (gameBoard[0][0] == s && gameBoard[1][1] == s && gameBoard[2][2] == s) return true;
        if (gameBoard[0][2] == s && gameBoard[1][1] == s && gameBoard[2][0] == s) return true;

        return false;
    }
}
