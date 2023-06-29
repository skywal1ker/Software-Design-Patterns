package project;

/**
 * The EventListener interface defines a contract for
 * objects that are interested in receiving updates
 * about the state of a game.
 */
public interface Notifier {

  public void update(GameEvent event);
}

