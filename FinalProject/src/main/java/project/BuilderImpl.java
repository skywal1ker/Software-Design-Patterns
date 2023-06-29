package project;

/**
 Implementation of the TicTacToeBuilder interface that builds a 3x3 Tic Tac Toe board
 with empty cells represented by the '-' character.
 */
public class BuilderImpl implements Builder {


  /* The Tic Tac Toe board represented as a 2D char array. */
  private char[][] board;

  /*
   Builds a new Tic Tac Toe board by initializing a 2D char array of size 3x3
   with empty cells represented by the '-' character.
   */
  @Override
  public void buildBoard() {
    board = new char[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = '-';
      }
    }
  }

  /*
   Returns a new TicTacToe object with the previously built board.
   @return a TicTacToe object with the current state of the board.
   */
  @Override
  public TicTacToe getTicTacToe() {
    return new TicTacToe(board);
  }
}