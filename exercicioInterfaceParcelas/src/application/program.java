package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installments;
import model.services.ContractService;
import model.services.PayPal;

public class program {
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter contract data:");
			System.out.print("Contract number: ");
			Integer contractNumber = sc.nextInt();
			System.out.print("Contract date: ");
			LocalDate contractDate = LocalDate.parse(sc.next(),fmt);
			System.out.print("Total value: ");
			Double totalValue = sc.nextDouble();
			
			Contract ctr = new Contract(contractNumber, contractDate, totalValue);
			
			System.out.print("How many installments? ");
			Integer installments = sc.nextInt();
			
			ContractService ctrService = new ContractService(new PayPal());
			ctrService.processInstallments(ctr, installments);
			
			for(Installments obj : ctr.getInstallments()) {
				System.out.println(obj);
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
