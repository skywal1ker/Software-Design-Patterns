package edu.bu.met.homework6;

/**
 * The VanDriver class represents a driver who can
 * receive delivery requests from a shop and uses a scooter for deliveries.
 */
class VanDriver extends Driver {

  /*
   * Creates a new VanDriver with the given name.
   * @param name the name of the driver
   */
  public VanDriver(String name) {
    super(name);
  }

  /*
   * Receives the given delivery request from a shop and
   *  prints a message indicating the request has been received.
   * @param request the delivery request to receive
   */
  @Override
  public void update(DeliveryRequest request) {
    System.out.println("Van driver " + name + " received a new delivery request: " + request);
  }
}
