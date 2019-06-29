package com.cogzy.programs;

import com.cogzy.model.Circle;
import com.cogzy.model.Rectangle;
import com.cogzy.model.Shape;
import com.cogzy.model.Triangle;

public class P05_CreateShapes {

	public static void main(String[] args) {

		Shape[] shapes = { new Rectangle(12, 34),
				new Rectangle(11, 22),
				new Circle(12.34), 
				new Triangle(12, 34) };
		for (int i = 0; i < shapes.length; i++) {
			Shape s = shapes[i];
			s.printArea();

		}
	}

}
