package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.entities.Product;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> items = new ArrayList<>();
		
		System.out.print("Enter file path: ");
		String path = sc.nextLine();
		
		File sourceFile = new File(path);
		String sourceFilestr = sourceFile.getParent();
		
		boolean sucess = new File(sourceFilestr + "\\out").mkdir();
		System.out.println("New File: " + sucess);
		
		String sumPath = sourceFilestr + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))){
			String line = br.readLine();
			while(line != null) {
				String[] data = line.split(",");
				String name = data[0];
				Double price = Double.parseDouble(data[1]);
				Integer quantity = Integer.parseInt(data[2]);
				items.add(new Product(name, price, quantity));
				line = br.readLine();
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(sumPath))){
				for(Product item : items) {
					bw.write(item.getName() + ", " + item.total());
					bw.newLine();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
