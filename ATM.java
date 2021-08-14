package atm;

import java.util.Scanner;

public class ATM { 
	
	public static void main(String[] args) {
		
		double checkingAccount = 5000;
		double savingAccount = 2000;
		
		Scanner cin = new Scanner(System.in);
		
		//Welcoming the user! 
		
		System.out.println("=======================");
		System.out.println("Welcome to SoundBank!");
		System.out.println("=======================");
		
		// Selections for the user
		
		while (true) { 
			
		System.out.println("Please choose: \nA - Checking Account \nB - Savings Account");
		String choice1 = cin.nextLine();
		 
		System.out.println("Please choose of the following: \nD - Deposit \nW - Withdrawal \nC - Check Balance \nE - Exit");
		String choice2 = cin.nextLine();
		
		
		switch (choice2.toUpperCase()) {
			case "D": 
				
				// Checking Account
				if (choice1.equalsIgnoreCase("A")) {
					
					System.out.println("How much you do you want to deposit?");
					double amount = cin.nextDouble();
					double total1 = checkingAccount + amount;
					System.out.println("You deposited " + amount);
					System.out.println("You currently have: " + total1);
					
				} else
				
				// Saving Account 
				if (choice1.equalsIgnoreCase("B")) {
					
					System.out.println("How much you do you want to deposit?");
					double amount2 = cin.nextDouble();
					double total2 = savingAccount + amount2;
					System.out.println("You deposited " + amount2);
					System.out.println("You currently have: " + total2);
					
				}  
				
				break;

			case "W":
				
				// Checking Account 
				if (choice1.equalsIgnoreCase("A")) {
					System.out.println("How much do you want to withdraw?");
					double amount3 = cin.nextDouble();
					double total3 = checkingAccount - amount3;
					System.out.println("You withdrew " + amount3);
					System.out.println("You currently have: " + total3);
				} else 
				// Saving Account
				if (choice1.equalsIgnoreCase("B")) { 
					System.out.println("How much do you want to withdraw?");
					double amount4 = cin.nextDouble();
					double total4 = savingAccount - amount4;
					System.out.println("You withdrew " + amount4);
					System.out.println("You currently have: " + total4);
				} 
				break;
				
			case "C":
				// Checking Account
				if (choice1.equalsIgnoreCase("A")) {
					System.out.println("Your current balance is: " + checkingAccount);
				} else 
				// Saving Account 
				if (choice1.equalsIgnoreCase("B")) {
					System.out.println("Your current balance is: " + savingAccount);
				}
				break;
				
			case "E":
				System.out.println("You exited the program.");
				return;
				
			default:
				System.out.println("Please choose a selction.");
		} 
		
		}
		
	} 
	
	

}
