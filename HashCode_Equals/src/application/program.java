package application;

import entities.Client;

public class program {
	public static void main(String[]args) {
		String x = "Maria";
		String y = "Pedro";
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Pedro", "pedro@gmail.com");
		
		System.out.println(x.hashCode());
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		System.out.println();
		
		System.out.println(x.equals(y));
		System.out.println(x.equals(x));
		System.out.println();
		
		System.out.println(c1.hashCode());
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println();
		
		System.out.println(c1.getName().equals(c2.getName()));
		System.out.println(c1.getName().equals(c1.getName()));
		System.out.println();
		
		System.out.println(x == y);
		//System.out.println(x == y)
		//System.out.println(c1 == c2); compara a posição em memória
	}
}
