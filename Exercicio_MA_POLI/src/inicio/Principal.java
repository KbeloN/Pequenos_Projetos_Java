package inicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Fisica;
import model.entities.Juridica;
import model.entities.Pessoa;

public class Principal {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n;i++) {
			System.out.println("Enter #" + i + " tax payer data");
			System.out.print("Person or Company(p/c)? ");
			Character ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual imcome: ");
			Double anualIncome = sc.nextDouble();
			if(ch == 'p') {
				System.out.print("Health expenditures: ");
				Double healthExpen = sc.nextDouble();
				list.add(new Fisica(name, anualIncome, healthExpen));
			}else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new Juridica(name, anualIncome, employees));
			}
		}
		
		System.out.println("");
		System.out.println("tax payer list:");
		int num = 1;
		for(Pessoa obj : list) {
			System.out.println(num + " - " + obj);
			num++;
		}
		
		sc.close();
	}
}
