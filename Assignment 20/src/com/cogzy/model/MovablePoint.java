package com.cogzy.model;

public class MovablePoint implements Movable {

	private int x, y, xSpeed, ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}

	public void moveUp()

	{
		y -= ySpeed;
	}

	public void moveDown()

	{
		y += ySpeed;
	}

	public void moveLeft()

	{
		x += xSpeed;
	}

	public void moveRight()

	{
		x -= xSpeed;
	}

}
