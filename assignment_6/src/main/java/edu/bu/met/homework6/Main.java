package edu.bu.met.homework6;

import java.time.LocalDate;

public class Main {

  /**
   * The main class where everything started.
   */
  public static void main(String[] args) {
    // Create a shop
    Shop shop = new Shop("OttoPizza");

    // Create some drivers
    Driver driver1 = new TaxiDriver("Elvis");
    Driver driver2 = new ScooterDriver("Jessica");
    Driver driver3 = new VanDriver("Bruce");
    Driver driver4 = new VanDriver("Leslie");
    Driver driver5 = new VanDriver("JaY");

    // Register observers with the shop
    shop.registerObserver(driver1);
    shop.registerObserver(driver2);
    shop.registerObserver(driver3);
    shop.registerObserver(driver4);
    shop.registerObserver(driver5);

    // Create a delivery request
    DeliveryRequest request = new DeliveryRequest("1", "119 Sutherland Road St.",
            "Jack Daniels", LocalDate.now());
    shop.addDeliveryRequest(request);

    // Remove an observer from the shop
    shop.removeObserver(driver5);

    // Create another delivery request
    DeliveryRequest request2 = new DeliveryRequest("2", "123 Main St.",
            "John Smith", LocalDate.now().plusDays(1));
    shop.addDeliveryRequest(request2);
  }

}