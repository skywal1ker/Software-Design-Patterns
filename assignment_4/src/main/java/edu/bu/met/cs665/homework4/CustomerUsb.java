package edu.bu.met.cs665.homework4;


/**
 * The CustomerUsb class implements the CustomerData_USB interface and provides
 * a USB-based implementation of the customer data functionality.
 */
public class CustomerUsb implements CustomerData_USB {

  /*
   * Implements the printCustomer method of the CustomerData_USB interface, which
   * simply prints the customer data to the console.
   */
  @Override
  public void printCustomer(int customerId) {
    System.out.println("Printing customer data from USB: " + customerId);
  }

  /*
   * Implements the getCustomer_USB method of the CustomerData_USB interface, which
   * retrieves the customer data from a USB-based source and prints it to the console.
   */
  @Override
  public void getCustomer_USB(int customerId) {
    System.out.println("Getting customer data from USB: " + customerId);
  }
}
