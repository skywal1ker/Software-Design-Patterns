package project;

/**
 The TicTacToe class represents the game board for Tic Tac Toe
 and provides methods for accessing and updating the board.
 */
public class TicTacToe {
  /* The game board represented by a 2D array of characters. */
  private char[][] board;


  /* Constructs a new TicTacToe object with the given board.
   @param board the game board represented by a 2D array of characters */
  public TicTacToe(char[][] board) {
    this.board = board;
  }


  /**  Displays the current state of the game board.  */
  public void display() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  /*
   Gets the character value of the cell at the given row
   and column on the game board.
    @param row the row index of the cell
   @param col the column index of the cell
   @return the character value of the cell at the
   given row and column on the game board
   */
  public char getGrid(int row, int col) {
    return board[row][col];
  }

  /*
   Sets the character value of the cell at the given row and column
   on the game board to the specified player character.
   @param row the row index of the cell
   @param col the column index of the cell
   @param currentPlayer the character value of the current player (either 'X' or 'O')
   */
  public void setGrid(int row, int col, char currentPlayer) {
    board[row][col] = currentPlayer;
  }
}