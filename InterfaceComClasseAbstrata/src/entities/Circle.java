package entities;

import entities.enums.Color;

public class Circle extends AbstractShape {
	private Double radius;

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	public Double area() {
		return Math.PI * radius * radius;
	}
}
