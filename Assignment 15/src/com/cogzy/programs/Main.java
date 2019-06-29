package com.cogzy.programs;

import com.cogzy.model.Cylinder;

public class Main {

	public static void main(String[] args) {
		Cylinder[] cylinders = { new Cylinder(12.34), new Cylinder(12.34, 10.0), new Cylinder(12.34, 10.0, "blue") };
		for (Cylinder c : cylinders) {
			System.out.printf("Area = %f,Volume = %f\n", c.getArea(),c.getVolume());
		}
	}

}
