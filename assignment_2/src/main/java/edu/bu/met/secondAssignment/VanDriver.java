/**
 * Name: Iztore Kargabayev
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: VanDriver.java
 * Description: Write a description for this class
 */

package edu.bu.met.secondAssignment;
import java.util.Observable;

/**
This is a subclass named VanDriver that extends the abstract class Driver.
It represents a driver who uses a van to make deliveries.
The class has a constructor that takes the name of the driver as a parameter and initializes it using the super constructor.
It overrides the update() method from the Observable class to receive notifications about new delivery requests.
If the object passed as an argument is an instance of DeliveryRequest, the method prints a message
indicating that the driver has received a new delivery request along with the details of the request.
*/
class VanDriver extends Driver {

    public VanDriver(String name) {
        super(name);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof DeliveryRequest) {
            DeliveryRequest request = (DeliveryRequest) arg;
            System.out.println("Van driver " + name + " received a new delivery request: " + request);
        }
    }
}

