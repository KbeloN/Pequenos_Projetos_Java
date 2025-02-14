package Application;

import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)){
			System.out.print("How many numbers: ");
			Integer numbers = sc.nextInt();
			
			PrintService ps = new PrintService(numbers);
			
			for(int i = 0;i < numbers;i++) {
				ps.addItem(sc.nextInt());
			}
			
			ps.print();
			System.out.println("First one: " + ps.first());
		} catch (IllegalStateException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
