package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  /**
   The main class for running a game of Tic Tac Toe.
   Allows players to take turns entering positions
   on the board until the game is over.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean playAgain = true;
    do {
      TicTacToeGame game = new TicTacToeGame();
      game.addListener(game);
      while (!game.isGameOver()) {
        System.out.print("Player " + game.getCurrentPlayer() + ", enter a position (1-9): ");
        int position = 0;
        while (true) {
          try {
            position = scanner.nextInt();
            if (position < 1 || position > 9) {
              throw new InputMismatchException();
            }
            break;
          } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a number between 1-9.");
            scanner.nextLine(); // consume the remaining newline character
          }
        }
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;
        game.play(row, col);
      }
      System.out.println("Game over!");
      System.out.print("Do you want to play again? (y/n): ");
      String input = scanner.next();
      while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")) {
        System.out.println("Invalid input! Please enter 'y' or 'n'.");
        input = scanner.next();
      }
      playAgain = input.equalsIgnoreCase("y");
    } while (playAgain);
    scanner.close();
  }


}
