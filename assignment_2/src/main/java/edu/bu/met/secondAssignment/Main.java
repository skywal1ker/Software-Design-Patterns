/**
 * Name: Iztore Kargabayev
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.secondAssignment;
import java.time.LocalDate;

/**
 This class represents the entry point to the application.
 It creates a shop, some drivers, and a delivery request.
 Then, it adds the drivers to the shop's list of observers and adds the delivery request to the shop.
 */
public class Main {
    public static void main(String[] args) {
        // Create a shop
        Shop shop = new Shop("OttoPizza");

        // Create some drivers
        Driver driver1 = new TaxiDriver("Elvis");
        Driver driver2 = new ScooterDriver("Jessica");
        Driver driver3 = new VanDriver("Bruce");
        Driver driver4 = new VanDriver("Leslie");
        Driver driver5 = new VanDriver("JaY");

        // Add drivers to the shop's list of observers
        shop.addObserver(driver1);
        shop.addObserver(driver2);
        shop.addObserver(driver3);
        shop.addObserver(driver4);
        shop.addObserver(driver5);

        // Create a delivery request
        DeliveryRequest request = new DeliveryRequest("1", "119 Sutherland Road St.", "Jack Daniels", LocalDate.now());
        shop.addDeliveryRequest(request);
    }

}