package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
	private Integer number;
	
	List<Integer> list = new ArrayList<>();

	public PrintService(Integer number) {
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public List<Integer> getList() {
		return list;
	}
	
	public void addItem(Integer num) {
		list.add(num);
	}
	
	public Integer first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("The list need to have something");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		System.out.print(list.get(0));
		for(int x = 1; x < number; x++) {
			System.out.print(", ");
			System.out.print(list.get(x));
		}
		System.out.println("]");
	}
}
