package edu.bu.met.homework6;

/**
 * The ScooterDriver class represents a driver who can receive
 * delivery requests from a shop and uses a scooter for deliveries.
 */
class ScooterDriver extends Driver {

  /*
   * Creates a new ScooterDriver with the given name.
   * @param name the name of the driver
   */
  public ScooterDriver(String name) {
    super(name);
  }

  /*
   * Receives the given delivery request from a shop and
   *  prints a message indicating the request has been received.
   * @param request the delivery request to receive
   */
  @Override
  public void update(DeliveryRequest request) {
    System.out.println("Scooter driver " + name + " received a new delivery request: " + request);
  }
}
