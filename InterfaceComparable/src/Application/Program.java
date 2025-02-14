package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employees;

public class Program {

	public static void main(String[] args) {
		String path = "c:\\ProjetosJAVA\\InterfaceComparable\\employees.csv";
		List<Employees> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String employeecsv = br.readLine();
			while(employeecsv != null) {
				String[] fields = employeecsv.split(",");
				list.add(new Employees(fields[0], Double.parseDouble(fields[1])));
				employeecsv = br.readLine();
			}
			
			Collections.sort(list);
			for(Employees obj : list) {
				System.out.println(obj.getName() + ", " + obj.getSalary());
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
