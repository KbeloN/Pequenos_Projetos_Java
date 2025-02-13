package entities;

public class Combo extends Device implements ScannerI, PrinterI {

	@Override
	public void print(String doc) {
		System.out.println("Printed: " + doc);
	}

	@Override
	public String Scan(String doc) {
		return "Scanning " + doc;
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Processing doc: " + doc);
	}

}
