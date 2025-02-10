package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class program {
	public static void main(String[]args) {
		File file = new File("c:\\ProjetosJava\\arquivosScanner\\in.txt\\");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			//Caso o scanner não seja aberto e tiver um sc.close, o programa vai quebrar e por isso, devemos testar se realmente precisa fecha-lo
			if(sc == null) {
				sc.close();
			}
		}
	}
}
