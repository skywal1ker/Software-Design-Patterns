package project;

/**
 A Tic Tac Toe Director class that takes a TicTacToeBuilder object and uses it to
 build a Tic Tac Toe game by calling its buildBoard() method.
 */
public class Director {
  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void buildGame() {
    builder.buildBoard();
  }
}