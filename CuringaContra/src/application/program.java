package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class program {

	public static void main(String[] args) {
		List<? super Number> list = new ArrayList<>();
		
		list.add(2 , 2);
		list.add(2.3);
		
		Number x = list.get(0);
		// Compilador não sabe se o elemento da lista vai ser compatível com a variável x
	}
}
