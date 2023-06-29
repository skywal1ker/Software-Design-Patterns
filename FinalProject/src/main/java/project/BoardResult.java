package project;

/**
 * The BoardResult class represents the outcome of a tic-tac-toe game.
 * It contains information about whether the game was won or drawn.
 */
public class BoardResult {
  private boolean isWin;
  private boolean isDraw;

  /*
   * Constructs a new BoardResult with the given win and draw flags.
   * @param isWin true if the game was won, false otherwise
   * @param isDraw true if the game was drawn, false otherwise
   */
  public BoardResult(boolean isWin, boolean isDraw) {
    this.isWin = isWin;
    this.isDraw = isDraw;
  }

  /*
   * Returns true if the game was won, false otherwise.
   * @return true if the game was won, false otherwise
   */
  public boolean isWin() {
    return isWin;
  }

  /*
   * Returns true if the game was drawn, false otherwise.
   * @return true if the game was drawn, false otherwise
   */
  public boolean isDraw() {
    return isDraw;
  }
}
