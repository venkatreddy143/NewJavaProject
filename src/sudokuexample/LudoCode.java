package sudokuexample;
import java.util.Random;
import java.util.Scanner;
public class LudoCode {
        private static final int BOARD_SIZE = 40;
        private static final int PLAYER_COUNT = 4;
        private static final int PIECES_PER_PLAYER = 4;

        private int[] playerPositions;
        private int currentPlayer;
        private Random random;

        public LudoCode() {
            playerPositions = new int[PLAYER_COUNT * PIECES_PER_PLAYER];
            currentPlayer = 0;
            random = new Random();
        }

        public void play() {
            Scanner scanner = new Scanner(System.in);

            while (!isGameOver()) {
                System.out.println("Current Player: Player " + (currentPlayer + 1));
                System.out.println("Press Enter to roll the dice.");
                scanner.nextLine();

                int diceValue = rollDice();
                System.out.println("Dice Roll: " + diceValue);

                movePiece(diceValue);

                displayBoard();
                switchPlayer();
            }

            int winner = getWinner();
            System.out.println("Player " + (winner + 1) + " wins!");
        }

        private boolean isGameOver() {
            for (int position : playerPositions) {
                if (position != BOARD_SIZE) {
                    return false;
                }
            }
            return true;
        }

        private int rollDice() {
            return random.nextInt(6) + 1;
        }

        private void movePiece(int steps) {
            int currentPosition = playerPositions[currentPlayer * PIECES_PER_PLAYER];
            int newPosition = (currentPosition + steps) % BOARD_SIZE;

            playerPositions[currentPlayer * PIECES_PER_PLAYER] = newPosition;
        }

        private void displayBoard() {
            System.out.println("Board:");

            for (int i = 0; i < PLAYER_COUNT; i++) {
                System.out.print("Player " + (i + 1) + ": ");
                for (int j = 0; j < PIECES_PER_PLAYER; j++) {
                    System.out.print(playerPositions[i * PIECES_PER_PLAYER + j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        private void switchPlayer() {
            currentPlayer = (currentPlayer + 1) % PLAYER_COUNT;
        }

        private int getWinner() {
            for (int i = 0; i < PLAYER_COUNT; i++) {
                boolean hasAllPiecesReachedGoal = true;
                for (int j = 0; j < PIECES_PER_PLAYER; j++) {
                    if (playerPositions[i * PIECES_PER_PLAYER + j] != BOARD_SIZE) {
                        hasAllPiecesReachedGoal = false;
                        break;
                    }
                }
                if (hasAllPiecesReachedGoal) {
                    return i;
                }
            }
            return -1; // No winner (should not happen if the game loop is correct)
        }

        public static void main(String[] args) {
            LudoCode ludoGame = new LudoCode();
            ludoGame.play();
        }
    }


