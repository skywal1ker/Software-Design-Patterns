package project;

import junit.framework.TestCase;

public class TicTacToeGameTest extends TestCase {

  public void testPlay() {
    TicTacToeGame game = new TicTacToeGame();

    // Try to play on an occupied cell
    game.play(0, 0); // X
    game.play(0, 0); // O
    assertFalse(game.isGameOver());
    assertEquals('O', game.getCurrentPlayer());
  }

  public void testPlay2() {
    TicTacToeGame game = new TicTacToeGame();

    // Try to play on an occupied cell
    game.play(0, 0); // X
    game.play(0, 1); // O
    game.play(0, 2); // O
    assertFalse(game.isGameOver());
    assertEquals('O', game.getCurrentPlayer());
  }

  public void testOWinsTopRow() {
    TicTacToeGame game = new TicTacToeGame();

    game.play(0, 0); // X
    game.play(1, 0); // O
    game.play(0, 1); // X
    game.play(1, 1); // O
    game.play(0, 2); // X
    game.play(1, 0); // O
    game.play(1, 1); // X
    game.play(2, 2); // O
    game.play(1, 2); // X
    game.play(2, 0); // O
    game.play(2, 1); // X

    assertTrue(game.isGameOver());
    assertEquals('O', game.getCurrentPlayer());
  }

  public void checkForWin() {
    TicTacToeGame game = new TicTacToeGame();

    // Play moves to result in a draw
    game.play(0, 0); // X
    game.play(0, 1); // O
    game.play(0, 2); // X
    game.play(1, 0); // O
    game.play(1, 1); // X
    game.play(2, 2); // O
    game.play(1, 2); // X
    game.play(2, 0); // O
    game.play(2, 1); // X

    // Check game status after draw
    assertEquals('X', game.getCurrentPlayer());
  }

  public void testXWinsTopRow() {
    TicTacToeGame game = new TicTacToeGame();

    game.play(0, 0); // X
    game.play(2, 0); // O
    game.play(1, 1); // x
    game.play(2, 1); // o
    game.play(2, 2); // x

    assertTrue(game.isGameOver());
    assertEquals('O', game.getCurrentPlayer());
  }




  public void testDraw() {
    TicTacToeGame game = new TicTacToeGame();

    // Play moves to result in a draw
    game.play(0, 0); // X
    game.play(0, 1); // O
    game.play(0, 2); // X
    game.play(1, 0); // O
    game.play(1, 1); // X
    game.play(2, 2); // O
    game.play(1, 2); // X
    game.play(2, 0); // O
    game.play(2, 1); // X

    // Check game status after draw
    assertTrue(game.isGameOver());
    assertFalse(game.checkForWin());
    assertTrue(game.checkForDraw());
  }
}