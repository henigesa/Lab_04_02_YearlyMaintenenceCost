//import scanner
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declare variables
        int springCost ;
        int summerCost ;
        int fallCost ;
        int winterCost ;
        double totalCost ;

        //prompt user to enter the cost
        System.out.println("Please enter the price of your spring maintenance cost:");
        //take the user input
        springCost = input.nextInt() ;
        //prompt user to enter the cost
        System.out.println("Please enter the price of your summer maintenance cost:");
        //take the user input
        summerCost = input.nextInt() ;
        System.out.println("Please enter the price of your fall maintenance cost:");
        //take the user input
        fallCost = input.nextInt() ;
        System.out.println("Please enter the price of your winter maintenance cost:");
        //take the user input
        winterCost = input.nextInt() ;
        //calculate total cost
        totalCost = springCost + summerCost + fallCost + winterCost ;
        //output the calculated total cost
        System.out.println("Your total home maintenance cost for the year is $" + totalCost + " with the cost components:") ;
        System.out.println ("Summer Maintenance Cost: $" + summerCost) ;
        System.out.println ("Fall Maintenance Cost: $" + fallCost) ;
        System.out.println ("Winter Maintenance Cost: $" + winterCost) ;
        System.out.println ("Spring Maintenance Cost: $" + springCost) ;
    }
}