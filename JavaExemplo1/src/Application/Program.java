package Application;

import entities.AbstractShape;
import entities.Circle;
import entities.Rectangle;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		AbstractShape r = new Rectangle(Color.BLACK, 2.63, 6.30);
		AbstractShape c = new Circle(Color.WHITE, 4.22);
		
		System.out.println("Color: " + r.getColor());
		System.out.println("Area : " + String.format("%.3f", r.area()));
		System.out.println("Color: " + c.getColor());
		System.out.println("Area : " + String.format("%.3f", c.area()));
	}

}
