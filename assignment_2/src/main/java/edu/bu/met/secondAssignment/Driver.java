/**
 * Name: Iztore Kargabayev
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: Driver.java
 * Description: Write a description for this class
 */

package edu.bu.met.secondAssignment;

import java.util.Observable;

import java.util.Observer;

/**
This is an abstract class named Driver that implements the Observer interface.
It represents a driver who can receive notifications about new delivery requests.
The class has an instance variable named "name" to store the name of the driver.
It has a constructor that takes the name of the driver as a parameter and initializes it.
It also has an overridden update() method from the Observer interface to receive notifications about new delivery requests.
If the object passed as an argument is an instance of DeliveryRequest, the method prints a message
indicating that the driver has received a new delivery request along with the details of the request.
*/
class Driver implements Observer {
    protected String name;

    public Driver(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        if (arg instanceof DeliveryRequest) {
            DeliveryRequest request = (DeliveryRequest) arg;
            System.out.println("DeliveryGuy " + name + " received a request: " + request);
        }
    }
}

