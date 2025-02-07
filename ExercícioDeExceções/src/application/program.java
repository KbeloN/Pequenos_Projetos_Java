package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BalanceException;

public class program {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data:");
			System.out.print("Account number: ");
			int number = sc.nextInt();
			System.out.print("Holder name: ");
			String holder = sc.next();
			System.out.print("Balance:");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withLimit = sc.nextDouble();
			Account ac = new Account(number, holder, balance, withLimit);
			
			System.out.println(" ");
			System.out.print("The amount you want to withdraw:");
			Double amount = sc.nextDouble();
			ac.withdraw(amount);
		}
		catch(BalanceException e) {
			System.out.println("Erro in operation: " + e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
