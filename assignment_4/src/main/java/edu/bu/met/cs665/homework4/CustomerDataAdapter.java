package edu.bu.met.cs665.homework4;


/**
 * The CustomerDataAdapter class is an adapter that allows the client to access
 * customer data through the CustomerData_USB interface, while using the
 * implementation provided by the CustomerData_HTTPS interface.
 */
public class CustomerDataAdapter implements CustomerData_USB {
  private CustomerData_HTTPS customerData;

  /*
   * Constructor that takes a CustomerData_HTTPS object as input and initializes
   * the customerData field.
   */
  public CustomerDataAdapter(CustomerData_HTTPS customerData) {
    this.customerData = customerData;
  }

  /*
   * Implements the printCustomer method of the CustomerData_USB interface, which
   * calls the printCustomer method of the CustomerData_HTTPS object.
   */
  @Override
  public void printCustomer(int customerId) {
    customerData.printCustomer(customerId);
  }

  /*
   * Implements the getCustomer_USB method of the CustomerData_USB interface, which
   * calls the getCustomer_HTTPS method of the CustomerData_HTTPS object.
   */
  @Override
  public void getCustomer_USB(int customerId) {
    customerData.getCustomer_HTTPS(customerId);
  }
}







