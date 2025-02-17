package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "c:\\ProjetosJAVA\\GenericsDelimitados\\in.txt";
		
		List<Integer> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				list.add(Integer.parseInt(line));
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
