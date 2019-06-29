package com.cogzy.model;

public class Square extends Rectangle {

	public Square() {
	}

	public Square(double side) {
		setWidth(side);
		setLength(side);
	}	

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public double getSide() {
		return getWidth();
	}

	public void setSide(double side) {
		setWidth(side);
		setLength(side);
	}

	public double getArea() {
		return super.getArea();
	}

	public double getPerimeter() {
		return super.getPerimeter();
	}

	@Override
	public String toString() {
		return "Square [side=" + getWidth() + "]";
	}

}
