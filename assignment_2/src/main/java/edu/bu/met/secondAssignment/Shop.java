/**
 * Name: Iztore Kargabayev
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: Shop.java
 * Description: Write a description for this class
 */

package edu.bu.met.secondAssignment;
import java.util.Observable;


/**
This is a class named Shop that extends the Observable class.
It represents a shop that can receive delivery requests and notify drivers about them.
The class has an instance variable named "name" to store the name of the shop.
It has a constructor that takes the name of the shop as a parameter and initializes it.
The class has a method named addDeliveryRequest() that takes a DeliveryRequest object as a parameter.
The method prints a message indicating that the shop has received a new delivery request along with the details of the request.
It then calls the setChanged() method of the Observable class to indicate that the state has changed
and notifies all observers by calling the notifyObservers() method with the request object as an argument.
*/
class Shop extends Observable {

    private String name;

    public Shop(String name) {
        this.name = name;
    }

    public void addDeliveryRequest(DeliveryRequest request) {
        // Do something with the delivery request
        System.out.println("Shop " + name + " received a new delivery request: " + request);
        setChanged();
        notifyObservers(request);
    }
}
