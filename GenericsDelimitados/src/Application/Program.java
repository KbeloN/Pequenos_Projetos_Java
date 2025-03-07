package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "c:\\ProjetosJAVA\\GenericsDelimitados\\in.csv";
		
		List<Product> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			System.out.println("Max: " + CalculationService.max(list));
			
		} 
		catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
		
		catch (IllegalStateException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
