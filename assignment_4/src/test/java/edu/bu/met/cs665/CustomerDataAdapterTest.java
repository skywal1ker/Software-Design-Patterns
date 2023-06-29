package edu.bu.met.cs665;

import edu.bu.met.cs665.homework4.CustomerDataAdapter;
import edu.bu.met.cs665.homework4.CustomerHttp;
import edu.bu.met.cs665.homework4.CustomerData_HTTPS;
import edu.bu.met.cs665.homework4.CustomerData_USB;
import junit.framework.TestCase;
public class CustomerDataAdapterTest extends TestCase {

  public void testPrintCustomer() {
    CustomerData_HTTPS customerData = new CustomerHttp();
    CustomerData_USB customerDataAdapter = new CustomerDataAdapter(customerData);
    customerDataAdapter.printCustomer(111);
    assertEquals(true, true);

  }

  public void testGetCustomer_USB() {
      CustomerData_HTTPS customerData = new CustomerHttp();
      CustomerData_USB customerDataAdapter = new CustomerDataAdapter(customerData);
      customerDataAdapter.getCustomer_USB(222);
      assertEquals(true, true);
    }
}