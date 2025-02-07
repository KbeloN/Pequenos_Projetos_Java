package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[]args) {
		method1();
		System.out.println("***END OF PROGRAM***");
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		try {
			System.out.println("***METHOD2 START***");
			String[] names = sc.nextLine().split(" ");
			int i = sc.nextInt();
			System.out.println(names[i]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid position");
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.println("invalid type");
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
		System.out.println("***METHOD2 END***");
	}

}
