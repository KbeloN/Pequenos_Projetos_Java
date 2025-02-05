package Inicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;
import model.entities.enums.Color;

public class Principal {
	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 1;i<=n;i++) {
			System.out.println("Enter #" + i + " Shape");
			System.out.print("Circle or rectangle (c/r)? ");
			Character ch = sc.next().charAt(0);
			System.out.print("Which color(RED/BLUE/GREEN)? ");
			Color color = Color.valueOf(sc.next());
			if(ch == 'r') {
				System.out.print("height: ");
				Double height = sc.nextDouble();
				System.out.print("width: ");
				Double width = sc.nextDouble();
				list.add(new Rectangle(color, height, width));
			} else {
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println(" ");
		System.out.println("Results:");
		for(Shape shape : list) {
			System.out.println(String.format("%.2f",shape.area()));
		}
		
		sc.close;
	}
}
