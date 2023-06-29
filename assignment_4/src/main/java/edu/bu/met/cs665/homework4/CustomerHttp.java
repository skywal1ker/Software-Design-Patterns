package edu.bu.met.cs665.homework4;

import edu.bu.met.cs665.homework4.CustomerData_HTTPS;

/**
 * The CustomerHttp class implements the CustomerData_HTTPS interface and provides
 * an HTTPS-based implementation of the customer data functionality.
 */
public class CustomerHttp implements CustomerData_HTTPS {

  /*
   * Implements the printCustomer method of the CustomerData_HTTPS interface, which
   * simply prints the customer data to the console.
   */
  @Override
  public void printCustomer(int customerId) {
    System.out.println("Printing customer data from HTTPS: " + customerId);
  }

  /*
   * Implements the getCustomer_HTTPS method of the CustomerData_HTTPS interface, which
   * retrieves the customer data from an HTTPS-based source and prints it to the console.
   */
  @Override
  public void getCustomer_HTTPS(int customerId) {
    System.out.println("Getting customer data from HTTPS: " + customerId);
  }
}

