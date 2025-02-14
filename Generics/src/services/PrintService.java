package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	List<T> list = new ArrayList<>();

	public PrintService() {
		
	}
	
	public void addItem(T element) {
		list.add(element);
	}
	
	public T first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("The list need to have something");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for(int x = 1; x < list.size(); x++) {
			System.out.print(", " + list.get(x));
		}
		System.out.println("]");
	}
}
