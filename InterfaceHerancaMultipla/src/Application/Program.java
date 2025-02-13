package Application;

import entities.Combo;
import entities.Printer;
import entities.Scanner;

public class Program {

	public static void main(String[] args) {
		Printer p = new Printer();
		p.print("my document");
		p.processDoc("my document");
		
		System.out.println(" ");
		Scanner s = new Scanner();
		System.out.println(s.Scan("my letter"));
		s.processDoc("my letter");
		
		
		System.out.println(" ");
		Combo c = new Combo();
		c.processDoc("Invoice");
		System.out.println(c.Scan("Invoice"));
		c.print("Invoice");
	}

}
