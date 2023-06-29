package project;

/**
 * A class representing a game event in TicTacToe.
 * This class contains a BoardResult object that represents
 * the result of a TicTacToe game.  * It is used to notify
 * EventListeners when a game has ended.
 */
public class GameEvent {
  /*
   The BoardResult representing the result of a TicTacToe game.
   */
  private BoardResult boardResult;


  /*
   Constructs a GameEvent object with the given BoardResult.
   @param boardResult the BoardResult representing
   the result of a TicTacToe game.
   */
  public GameEvent(BoardResult boardResult) {
    this.boardResult = boardResult;
  }


  /*
   Returns the BoardResult of this GameEvent.
   @return the BoardResult representing the result of a TicTacToe game.
   */
  public BoardResult getBoardResult() {
    return boardResult;
  }
}