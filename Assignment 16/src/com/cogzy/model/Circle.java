package com.cogzy.model;

public class Circle extends Shape {

	private double radius;

	Circle() {

	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void printArea() {
		double area = Math.PI * radius * radius;
		System.out.printf("Area of Circle with radius = %.2f is %.2f\n", radius, area);
	}
}
