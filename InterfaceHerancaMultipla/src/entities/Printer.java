package entities;

public class Printer extends Device implements PrinterI {
	@Override
	public void processDoc(String doc) {
		System.out.println("Processing doc: " + doc);
		
	}
	
	@Override
	public void print(String doc) {
		System.out.println("Printed: " + doc);
	}
}
