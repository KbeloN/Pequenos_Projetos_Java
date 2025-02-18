package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class program {
	public static void main(String[]args) {
		List<Integer> myInt = Arrays.asList(1, 2, 3);
		List<?> myObject = new ArrayList<>();

		myObject = myInt;
		
		print(myObject);
	}
	public static void print(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}
