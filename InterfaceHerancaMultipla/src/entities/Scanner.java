package entities;

public class Scanner extends Device implements ScannerI {

	@Override
	public String Scan(String doc) {
		return "Scanning " + doc;
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Processing doc: " + doc);
	}
}
