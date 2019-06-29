package com.cogzy.model;

public class Triangle extends Shape {

	private double base;
	private double height;

	Triangle() {

	}

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void printArea() {
		double area = 0.5 * base * height;
		System.out.printf("Area of Triangle with base = %.2f and height = %.2f\n", base, height, area);
	}

}
