package edu.bu.met.cs665.Assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialize a VendingMachine object to store the selected drink
        VendingMachine vendingMachine = null;

        // Initialize a boolean variable to control the main loop
        boolean t = true;

        // The main loop that allows the user to select a drink and add sugar and milk
        while (t == true) {

            // Display the options for selecting a drink
            System.out.println("Please select your drink: ");
            System.out.println("1. Coffee");
            System.out.println("2. Tea");

            // Read the user's choice for a drink
            int choice = scanner.nextInt();

            // If the user chooses coffee
            if (choice == 1) {
                // Create a Coffee object
                vendingMachine = new Coffee();

                // Display the options for selecting a coffee type
                System.out.println("Please select your coffee type: ");
                System.out.println("1. Espresso");
                System.out.println("2. Americano");
                System.out.println("3. Latte Macchiato");

                // Read the user's choice for a coffee type
                choice = scanner.nextInt();

                // Choose the corresponding coffee type based on the user's input
                switch (choice) {
                    case 1:
                        // Call the espresso() method on the Coffee object
                        ((Coffee) vendingMachine).espresso();
                        // End the main loop
                        t = false;
                        break;
                    case 2:
                        // Call the americano() method on the Coffee object
                        ((Coffee) vendingMachine).americano();
                        // End the main loop
                        t = false;
                        break;
                    case 3:
                        // Call the latteMacchiato() method on the Coffee object
                        ((Coffee) vendingMachine).latteMacchiato();
                        // End the main loop
                        t = false;
                        break;
                }
            }
            // If the user chooses tea
            else if (choice == 2) {
                // Create a Tea object
                vendingMachine = new Tea();

                // Display the options for selecting a tea type
                System.out.println("Please select your tea type: ");
                System.out.println("1. Black Tea");
                System.out.println("2. Green Tea");
                System.out.println("3. Yellow Tea");

                // Read the user's choice for a tea type
                choice = scanner.nextInt();

                // Choose the corresponding tea type based on the user's input
                switch (choice) {
                    case 1:
                        // Call the blackTea() method on the Tea object
                        ((Tea) vendingMachine).blackTea();
                        // End the main loop
                        t = false;
                        break;
                    case 2:
                        // Call the greenTea() method on the Tea object
                        ((Tea) vendingMachine).greenTea();
                        // End the main loop
                        t = false;
                        break;
                    case 3:
                        // Call the yellowTea() method on the Tea object
                        ((Tea) vendingMachine).yellowTea();
                        // End the main loop
                        t = false;
                        break;

                }
            } else System.out.println("Invalid choice, please choose again or die!");
        }

        // Asks the user for the number of milks they want to add and stores it in the milkCount variable
        System.out.println("How many milks do you want to add? (Max 3)");
        int milkCount = scanner.nextInt();

// Validates the number of milks entered by the user and ensures it does not exceed 3
        while (milkCount > 3) {
            System.out.println("You can only add up to 3 milks. Please enter a number less than or equal to 3.");
            milkCount = scanner.nextInt();
        }

// Adds the number of milks entered by the user to the vending machine
        for (int i = 0; i < milkCount; i++) {
            vendingMachine.addMilk();
        }

// Asks the user for the number of sugars they want to add and stores it in the sugarCount variable
        System.out.println("How many sugars do you want to add? (Max 3)");
        int sugarCount = scanner.nextInt();

// Validates the number of sugars entered by the user and ensures it does not exceed 3
        while (sugarCount > 3) {
            System.out.println("You can only add up to 3 sugars. Please enter a number less than or equal to 3.");
            sugarCount = scanner.nextInt();
        }

// Adds the number of sugars entered by the user to the vending machine
        for (int i = 0; i < sugarCount; i++) {
            vendingMachine.addSugar();
        }

// Displays the total price, number of milks, and number of sugars in the vending machine
        System.out.println("Total price: $" + vendingMachine.getPrice());
        System.out.println("Milks: " + vendingMachine.getMilk());
        System.out.println("Sugars: " + vendingMachine.getSugar());

    }
}