package project;

import java.util.ArrayList;
import java.util.List;


/**
 * Represents a game of Tic Tac Toe. The game board is built using a
 * TicTacToeBuilder and the game progresses as players take turns
 * playing their moves until a win or a draw is reached.
 * The game can be played by calling the play() method with the
 * row and column of the cell to be played.
 * The game status can be checked using isGameOver()
 * and getCurrentPlayer() methods.
 * The game can be listened to for changes in the board
 * status by adding an EventListener.
 */
public class TicTacToeGame implements Notifier {
  private Director director;
  private Builder builder;
  private TicTacToe ticTacToe;
  private char currentPlayer;
  private boolean isGameOver;


  /**
   * Constructs a new Tic Tac Toe game by initializing
   * the builder and director objects, building the game board,
   * and setting the current player to 'X'.
   */
  public TicTacToeGame() {
    builder = new BuilderImpl();
    director = new Director(builder);
    director.buildGame();
    ticTacToe = builder.getTicTacToe();
    currentPlayer = 'X';
    isGameOver = false;
  }


  /**
   * Plays a move in the TicTacToe game given a row and column.
   * Checks if the game is over or if the cell is already
   * occupied before placing the move.
   * Changes the currentPlayer and checks the game status
   * after placing the move.
   * @param row The row of the cell to place the move.
   * @param col The column of the cell to place the move.
   */
  public void play(int row, int col) {
    if (isGameOver) {
      System.out.println("Game is over.");
      return;
    }
    if (ticTacToe.getGrid(row, col) != '-') {
      System.out.println("Cell is already occupied.");
      return;
    }
    ticTacToe.setGrid(row, col, currentPlayer);
    ticTacToe.display();
    checkGameStatus();
    currentPlayer = currentPlayer == 'X' ? 'O' : 'X';
  }



  private void checkGameStatus() {
    boolean isWin = checkForWin();
    boolean isDraw = checkForDraw();
    if (isWin || isDraw) {
      isGameOver = true;
      BoardResult result = new BoardResult(isWin, isDraw);
      notifyListeners(result);
    }
  }


  /*
   Checks the game status by calling checkForWin
    and checkForDraw. If the game is won or drawn,
    sets isGameOver to true, creates a BoardResult
    object, and notifies all listeners with a
    GameEvent containing the BoardResult.
   */
  boolean checkForWin() {
    // check columns
    for (int j = 0; j < 3; j++) {
      if (ticTacToe.getGrid(0, j) == currentPlayer && ticTacToe
          .getGrid(1, j) == currentPlayer && ticTacToe
          .getGrid(2, j) == currentPlayer) {
        return true;
      }
    }
    // check diagonals
    if (ticTacToe.getGrid(0, 0) == currentPlayer && ticTacToe
        .getGrid(1, 1) == currentPlayer && ticTacToe
        .getGrid(2, 2) == currentPlayer) {
      return true;
    }

    return false;
  }


  /*
   Checks if the game has ended in a draw.
   Checks if all cells on the board are occupied.
   @return True if the game has ended in a draw, false otherwise.
   */
  boolean checkForDraw() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (ticTacToe.getGrid(i, j) == '-') {
          return false;
        }
      }
    }
    return true;
  }

  /* A list of EventListeners to be notified when the game state changes. */
  private List<Notifier> listeners = new ArrayList<>();


  /* Adds a new EventListener to the list of listeners.
   @param listener the listener to add   */
  public void addListener(Notifier listener) {
    listeners.add(listener);
  }

  /* Removes an EventListener from the list of listeners.
   @param listener the listener to remove  */
  public void removeListener(Notifier listener) {
    listeners.remove(listener);
  }


  /* Notifies all event listeners of a board result.
   @param result the board result to notify listeners */
  private void notifyListeners(BoardResult result) {
    for (Notifier listener : listeners) {
      listener.update(new GameEvent(result));
    }
  }


  /* Updates the game state based on a game event.
   @param event the game event to update the game state with  */
  @Override
  public void update(GameEvent event) {
    if (event.getBoardResult().isWin()) {
      System.out.println("Player " + currentPlayer + " wins!");
    } else if (event.getBoardResult().isDraw()) {
      System.out.println("Game ends in a draw.");
    }
  }


  /* Gets the current player. @return the current player */
  public char getCurrentPlayer() {
    return currentPlayer;
  }

  /* Checks if the game is over.
  @return true if the game is over, false otherwise  */
  public boolean isGameOver() {
    return isGameOver;
  }


}
