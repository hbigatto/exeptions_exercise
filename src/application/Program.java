package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
		//getting data from user
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int num = input.nextInt();
		System.out.print("Holder: ");
		input.next();
		String name = input.nextLine();
		System.out.print("Initial balance: ");
			Double bal = input.nextDouble();
		System.out.print("Withdraw limit: ");
		Double limit = input.nextDouble();
		
		//instantiate the account object
		Account ac = new Account(num, name, bal, limit);
		
		System.out.print("\nEnter amount for withdraw: ");
		Double withdraw = input.nextDouble();
		
		ac.withdraw(withdraw);
		}
		catch(DomainException e){
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		//close scanner object
		input.close();
		
		
		

	}
	//End of main method
}
//End of class