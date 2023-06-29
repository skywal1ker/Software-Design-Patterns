/**
 * Name: Iztore Kargabayev
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: DeliveryRequest.java
 * Description: Write a description for this class
 */

package edu.bu.met.secondAssignment;
import java.time.LocalDate;


/*
This is a class named DeliveryRequest that represents a request for delivery of an item to a particular address
for a specific customer on a specific delivery date.
It has four instance variables id, address, customerName, and deliveryDate.
The class has a constructor that takes all four instance variables as parameters and initializes them.
It also has four getter methods to retrieve the values of the instance variables, and a setter method to set the delivery date.
The class overrides the toString() method to provide a string representation of a DeliveryRequest object,
which includes the request's ID, customer name, address, and delivery date.
*/
public class DeliveryRequest {
    private String id;
    private String address;
    private String customerName;
    private LocalDate deliveryDate;

    public DeliveryRequest(String id, String address, String customerName, LocalDate deliveryDate) {
        this.id = id;
        this.address = address;
        this.customerName = customerName;
        this.deliveryDate = deliveryDate;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String toString() {
        return "Delivery request #" + id + " for " + customerName + " at " + address
                + " with delivery date of " + deliveryDate.now();
    }

}
