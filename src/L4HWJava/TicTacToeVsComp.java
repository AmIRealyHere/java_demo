package L4HWJava;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class TicTacToeVsComp {

        private char[] board;
        private char currentPlayer;

        public TicTacToeVsComp() {
            board = new char[9];
            initializeBoard();
            choosePlayer();
        }

        public void initializeBoard() {
            Arrays.fill(board, ' ');
        }

    public void choosePlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play as 'X' or 'O'? Enter 'X' or 'O': ");
        char choice = scanner.next().charAt(0);
        if (choice == 'X' || choice == 'O') {
            currentPlayer = choice;
            System.out.println("You chose to play as '" + currentPlayer + "'.");
        } else {
            System.out.println("Invalid choice. Defaulting to 'X'.");
            currentPlayer = 'X'; // Default to 'X' if invalid choice
        }
    }

        public void displayBoard() {
            System.out.println("-------------");
            for (int i = 0; i < 9; i += 3) {
                System.out.println("| " + board[i] + " | " + board[i + 1] + " | " + board[i + 2] + " |");
                System.out.println("-------------");
            }
        }

        public void playGame() {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int move;

            while (!isGameOver()) {
                System.out.println("Player " + currentPlayer + "'s turn.");

                if (currentPlayer == 'X') {
                    System.out.print("Enter your move (1-9): ");
                    move = scanner.nextInt() - 1;
                } else {
                    move = random.nextInt(9);
                    while (board[move] != ' ') {
                        move = random.nextInt(9);
                    }
                    System.out.println("Computer chooses move " + (move + 1));
                }

                if (isValidMove(move)) {
                    makeMove(move);
                    displayBoard();
                    if (currentPlayerWins()) {
                        System.out.println("Player " + currentPlayer + " wins!");
                        return;
                    }
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }

            System.out.println("It's a tie!");
        }

        public boolean isValidMove(int move) {
            return move >= 0 && move < 9 && board[move] == ' ';
        }

        public void makeMove(int move) {
            board[move] = currentPlayer;
        }

        public boolean currentPlayerWins() {
            for (int i = 0; i < 9; i += 3) {
                if (board[i] == currentPlayer && board[i + 1] == currentPlayer && board[i + 2] == currentPlayer) {
                    return true;
                }
            }
            for (int i = 0; i < 3; i++) {
                if (board[i] == currentPlayer && board[i + 3] == currentPlayer && board[i + 6] == currentPlayer) {
                    return true;
                }
            }
            return (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
                    (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
        }

        public boolean isGameOver() {
            for (char cell : board) {
                if (cell == ' ') {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            TicTacToeVsComp game = new TicTacToeVsComp();
            game.displayBoard();
            game.playGame();
        }
    }


