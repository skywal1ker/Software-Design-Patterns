/**
 * Name: Iztore Kargabayev
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/30/2023
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665.homework4;


public class Main {

  /**
   * This is the Main class which is client here.
   */
  public static void main(String[] args) {
    // Create instances of the USB-based and HTTPS-based customer data
    CustomerData_USB usbCustomer = new CustomerUsb();
    CustomerData_HTTPS httpsData = new CustomerHttp();

    // Create an adapter instance that adapts the HTTPS-based customer data to the USB interface
    CustomerData_USB customerAdapter = new CustomerDataAdapter(httpsData);

    // Use the USB-based customer data instance to print and retrieve customer data
    usbCustomer.printCustomer(22);
    usbCustomer.getCustomer_USB(22);

    // Use the adapter instance to print and retrieve
    // customer data from the HTTPS-based customer data source
    // also convert usb to https
    customerAdapter.printCustomer(11);
    customerAdapter.getCustomer_USB(11);
  }

}



