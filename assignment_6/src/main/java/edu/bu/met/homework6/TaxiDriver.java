package edu.bu.met.homework6;

/**
 * The TaxiDriver class represents a driver who can receive
 * delivery requests from a shop and uses a scooter for deliveries.
 */
class TaxiDriver extends Driver {

  /*
   * Creates a new TaxiDriver with the given name.
   * @param name the name of the driver
   */
  public TaxiDriver(String name) {
    super(name);
  }


  /*
   * Receives the given delivery request from a shop and
   * prints a message indicating the request has been received.
   * @param request the delivery request to receive
   */
  @Override
  public void update(DeliveryRequest request) {
    System.out.println("Taxi driver " + name + " received a new delivery request: " + request);
  }
}
