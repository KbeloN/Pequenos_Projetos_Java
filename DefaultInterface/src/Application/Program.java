package Application;

import java.security.InvalidParameterException;
import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;

public class Program {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in);){
			
			System.out.print("Amount to pay: ");
			Double amount = sc.nextDouble();
			System.out.print("Mounths: ");
			Integer mounths = sc.nextInt();
			
			InterestService is = new BrazilInterestService(2.0);
			Double amountAfter = is.payment(amount, mounths);
			System.out.print("What you have to pay after " + mounths + " mounths: " + String.format("%.2f", amountAfter));
			
		} catch (InvalidParameterException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
