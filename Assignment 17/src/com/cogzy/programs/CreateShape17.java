package com.cogzy.programs;

import com.cogzy.model.Circle;
import com.cogzy.model.Rectangle;
import com.cogzy.model.Square;

public class CreateShape17 {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();
		System.out.println("Rectangle width: " + rectangle.getWidth() + " and length: " + rectangle.getLength()
				+ "\nResulting area: " + rectangle.getArea() + "\nResulting perimeter: " + rectangle.getPerimeter()
				+ "\n");

		Circle circle = new Circle();
		System.out.println("Circle radius: " + circle.getRadius() + "\nResulting Area: " + circle.getArea()
				+ "\nResulting Perimeter: " + circle.getPerimeter() + "\n");

		Square square = new Square();
		System.out.println("Square : " + square.getSide() + "\nResulting Area: " + square.getArea()
				+ "\nResulting Perimeter: " + square.getPerimeter() + "\n");

	}
}