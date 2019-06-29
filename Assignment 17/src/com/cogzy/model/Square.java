package com.cogzy.model;

public class Square extends Shape {

	double side;

	public Square() {

	}

	public Square(double side) {
		super();
		this.side = side;
	}

	public Square(String color, boolean filled, double side) {
		super(color, filled);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getArea() {

		return side * side;

	}

	public double getPerimeter() {

		return 4 * side;

	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

}
