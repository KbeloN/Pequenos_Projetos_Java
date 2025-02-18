package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class program {
	public static void main(String[]args) {
		
		List<Integer> myInt = Arrays.asList(1 ,3 , 5);
		List<Double> myDouble = Arrays.asList(2.5 , 6.9);
		List<Object> myObj = new ArrayList<Object>();
		
		copy(myInt, myObj);
		copy(myDouble, myObj);
		
		printList(myObj);
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number item : source) {
			destiny.add(item);
		}
	}
	
	public static void printList(List<?> list) {
		System.out.print(list.get(0));
		for(int i = 1;i < list.size(); i++ ) {
			System.out.print(", " + list.get(i));
		}
	}
}
