package edu.bu.met.homework6;

/**
 * The Driver class represents a driver who can receive delivery requests from a shop.
 */
class Driver implements Observer {
  protected String name;

  /*
   * Creates a new Driver with the given name.
   * @param name the name of the driver
   */
  public Driver(String name) {
    this.name = name;
  }

  /*
   * Receives the given delivery request from a shop.
   * @param request the delivery request to receive
   */
  public void update(DeliveryRequest request) {
    System.out.println("DeliveryGuy " + name + " received a request: " + request);
  }
}
