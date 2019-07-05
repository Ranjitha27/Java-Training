package com.cogzy.model;

public class Circle implements Shape {

	private double radius;

	public Circle() {
	}

	public Circle(double radius) {

		this.radius = radius;

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void printArea() {

		double area = PI * radius * radius;

		System.out.printf("Area of circle with radius = %.2f is %.2f sq.units\n", radius, area);

	}

}
