package Application;

import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try (Scanner sc = new Scanner(System.in)){
			System.out.print("How many values: ");
			Integer values = sc.nextInt();
			
			PrintService<Integer> ps = new PrintService<Integer>();
			
			for(int i = 0; i < values; i++) {
				ps.addItem(sc.nextInt());
			}
			
			ps.print();
			System.out.println("First one: " + ps.first());
		}
		catch (IllegalStateException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
