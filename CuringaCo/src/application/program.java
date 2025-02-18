package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class program {
	public static void main(String[] args) {
		List<Shape> shapeList = new ArrayList<>();
		shapeList.add(new Rectangle(2.5, 9.8));
		shapeList.add(new Circle(9.8));
		
		System.out.println("Total area: " + summary(shapeList));
	}
	
	public static Double summary(List<? extends Shape> list) {
		//Não pode adicionar elementos na lista com covariância
		Double sum = 0.0;
		for(Shape obj : list) {
			sum += obj.area();
		}
		return sum;
	}
}
