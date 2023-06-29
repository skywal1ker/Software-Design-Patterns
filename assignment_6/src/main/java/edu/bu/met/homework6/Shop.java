package edu.bu.met.homework6;

import java.util.ArrayList;
import java.util.List;

/**
 * The Shop class represents a shop that can receive
 * delivery requests and notify its registered observers.
 */
class Shop implements Observable {

  private String name;
  private List<Observer> observers;

  /*
   * Creates a new Shop with the given name.
   * @param name the name of the shop
   */
  public Shop(String name) {
    this.name = name;
    observers = new ArrayList<>();
  }

  /*
   * Adds the given delivery request to the shop and notifies its observers.
   * @param request the delivery request to add
   */
  public void addDeliveryRequest(DeliveryRequest request) {
    // Do something with the delivery request
    System.out.println("Shop " + name + " received a new delivery request: " + request);
    notifyObservers(request);
  }

  /*
   * Registers the given observer with the shop.
   * @param observer the observer to register
   */
  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  /*
   * Removes the given observer from the shop.
   * @param observer the observer to remove
   */
  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  /*
   * Notifies all registered observers with the given delivery request.
   * @param request the delivery request to notify observers with
   */
  @Override
  public void notifyObservers(DeliveryRequest request) {
    for (Observer observer : observers) {
      observer.update(request);
    }
  }
}
