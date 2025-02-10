package application;

import java.io.File;
import java.util.Scanner;

public class program {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		String path = sc.next();
		
		File file = new File(path);
		
		File[] folders = file.listFiles(File::isDirectory);
		System.out.println("Folders:");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = file.listFiles(File::isFile);
		System.out.println("Files:");
		for(File fil : files) {
			System.out.println(fil);
		}
		
		boolean sucesso = new File(path + "\\NovaPasta").mkdir();
		System.out.println("Criou pasta: " + sucesso);
		sc.close();
	}
}
