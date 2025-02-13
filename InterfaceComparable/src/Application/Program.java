package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		String path = "c:\\ProjetosJAVA\\InterfaceComparable\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			List<String> list = new ArrayList<>();
			String name = br.readLine();
			while(name != null) {
				list.add(name);
				name = br.readLine();
			}
			
		Collections.sort(list);
		
		for(String obj : list) {
			System.out.println(obj);
		}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
