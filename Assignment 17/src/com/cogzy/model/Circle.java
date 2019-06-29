package com.cogzy.model;

public class Circle extends Shape {

	double radius = 1.0;

	public Circle() {

	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {

		return Math.PI * radius * radius;
	}

	public double getPerimeter() {

		return 2 * Math.PI * radius * radius;

	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}