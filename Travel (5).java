package project1;
/*
 * Name: Valerie Dawson
 * Overview: This program calculates the total cost of trip to Argentina for 
 * Sweet Dreams Travel Agency
 * Input: Customer's name, # of persons traveling, # of nights of stay
 * How much money the customer wants to take with them for their expenses 
 * Output: Vacation trip to Argentina, Quantity of air fare, lodging and money,
 * Price of each item, and the total cost for each item, cost of trip in USD.
 * converts USD to Pesos, and Confirmation Code. 
 * Variables: TICKET_COST, HOTEL_COST, CONVERSION_FEE, PESOS_PER_DOLLAR,
 * PERSONS, NIGHTS, EXPENSES, TOTAL 1, TOTAL, SUBTOTAL.MINUSEX, FULLTOTAL,NUM1
 */
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;


public class Travel {

	public static void main(String[]  args) {
		final double TICKET_COST = 1898.99;
		final double HOTEL_COST = 302.99;
		final double CONVERSION_FEE = 0.03;
		final double PESOS_PER_DOLLAR = 499.95;
		
		
		
		Scanner scan = new Scanner (System.in);
		NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
		// imput of user Last Name 
		System.out.println("Customer Last Name:\t");
		String Name = scan.nextLine();
		
		// Input of # of persons 
		System.out.println("Enter Number of persons traveling:\t");
		int persons = scan.nextInt();
		
		// Input of # of nights
		System.out.println("Enter the number of nights for your stay:\t");
		int nights = scan.nextInt();
		
		// Input of amount of money for expenses
		
		System.out.println("Money for expenses:\t");
		int expenses = scan.nextInt();
		
		//Output 
		System.out.println("Customer Last Name: \t" + Name);
		System.out.println("Number of persons: \t" + persons);
		System.out.println("Number of nights at the Best Hotel: \t" + nights);
		System.out.println("Money for expenses: \t" + expenses);
		
		// Name of traveling company & Categories for Quantity, Price and Total
		System.out.println("\t \t Sweet Travels \t \n \t\t//---//--~--\\\\---\\\\ \n " + Name.toUpperCase() +"\tVacation Trip to Argentina");
		System.out.println("\t\tQuantity\tPrice\t\tTotal");
		System.out.println("\t\t~~~~~\t\t~~~~\t\t~~~~");
		
		//Air fare Quantity, Price & Total
		System.out.print("Air Fare:\t" + persons );
		System.out.print("\t\t");
		System.out.print(fmt1.format (TICKET_COST ));
		System.out.print("\t");
		System.out.print(fmt1.format(TICKET_COST * persons));
		System.out.print("\n");
		double total1 = TICKET_COST * persons;
		// Output of total for lodging: # of nights, total price based on user input
		System.out.print("Lodging:\t" + nights);
		System.out.print("\t\t");
		System.out.print(fmt1.format(HOTEL_COST));
		System.out.print("\t");
		System.out.print("\t");
		System.out.print(fmt1.format(HOTEL_COST * nights));
		System.out.print("\n");
		double total = (HOTEL_COST * nights);
		
		//Output of user input of money available
		System.out.println("Money:\t\t\t\t\t\t"+fmt1.format(expenses));
		System.out.println("\t\t\t\t\t\t=========");
		System.out.println("Total:\t\t\t\t\t\t" + fmt1.format(total1 + total + expenses));
		double minusex = (total1 + total + expenses);
		double subtotal = (minusex * PESOS_PER_DOLLAR);
		double fulltotal = (subtotal * CONVERSION_FEE);
		
		//output of Conversion to pesos
		System.out.println("Pesos Argentinos for the trip:\t\t\t" +fmt1.format(fulltotal));
		// Generates a random confirmation #
		Random generator = new Random();
		int num1;
		 num1 = generator.nextInt();
		System.out.print("\t\t");
		System.out.println("Confirmation Code: # \t\t" + num1); 
		scan.close();
	}

}
