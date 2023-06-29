package project;

/**
 The TicTacToeBuilder interface provides methods to build a Tic Tac Toe game board and
 get the TicTacToe object once it has been built.
 */
public interface Builder {

  public void buildBoard();

  public TicTacToe getTicTacToe();
}