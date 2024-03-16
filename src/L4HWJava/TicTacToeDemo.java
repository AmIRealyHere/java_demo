package L4HWJava;

import java.util.Scanner;

public class TicTacToeDemo {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Player X goes first.");

        while (true) {
            // Display the current game board
            game.displayBoard();

            // Get the row and column for the move
            System.out.println("Player " + game.currentPlayer + ", enter your move (row and column):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // Make the move
            if (game.makeMove(row, col)) {
                // Check for a win
                if (game.checkWin()) {
                    game.displayBoard();
                    System.out.println("Player " + game.currentPlayer + " wins!");
                    break;
                }
                // Switch player if there is no win
                game.switchPlayer();
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
        scanner.close();
    }
}

