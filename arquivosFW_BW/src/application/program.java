package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class program {
	public static void main(String[] args) {
		String [] list = new String[] {"eita", "nós", "gente"};
		String path = "c:\\ProjetosJAVA\\arquivosFW_BW\\in.txt";
		//new FileWriter(path,true) == adicionar mais informações nas últimas linhas
		//new FileWriter(path) == criar ou refazer o arquivo do zero
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
			String line;
			for(String obj : list) {
				bw.write(obj);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
