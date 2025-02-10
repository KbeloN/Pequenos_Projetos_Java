package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class program {
	public static void main(String[]args) {
		String path = "c:\\ProjetosJava\\arquivosScanner\\in.txt";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(path));
			
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			//O try-catch é usado porque quanto o programa tentar fechar o br e o fr pode dar a exceção IOException,
			//e como ela é uma extensão da classe exception, devemos trata-la.
			try {
				if(br != null) {
					br.close();
				}
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
