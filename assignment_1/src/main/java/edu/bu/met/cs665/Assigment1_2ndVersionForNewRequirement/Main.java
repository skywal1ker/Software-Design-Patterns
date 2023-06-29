package edu.bu.met.cs665.Assigment1_2ndVersionForNewRequirement;

public class Main {
    public static void main(String[] args) {

        // Creating an instance of Coffee
        Coffee coffee = new Coffee();

        // Calling the espresso method on coffee
        coffee.espresso();

        // Adding milk and printing final price
        coffee.milk.addMilk(coffee);
        coffee.milk.addMilk(coffee);
        coffee.milk.addMilk(coffee);
        System.out.println("Total price will be " + coffee.getPrice());


        // Creating an instance of Tea
        Tea tea = new Tea();
        // Calling the blackTea method on tea
        tea.greenTea();

        // Adding sugar and printing final price
        tea.sugar.addSugar(tea);
        tea.sugar.addSugar(tea);
        tea.sugar.addSugar(tea);
        System.out.println("Total price will be " + tea.getPrice());



    }


}
