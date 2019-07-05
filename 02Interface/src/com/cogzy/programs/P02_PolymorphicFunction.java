package com.cogzy.programs;

import com.cogzy.model.Circle;
import com.cogzy.model.Rectangle;
import com.cogzy.model.Shape;
import com.cogzy.model.Triangle;

public class P02_PolymorphicFunction {

	static void printArea(Shape sh) {

		sh.printArea();

	}

	public static void main(String[] args) {

		Triangle t1 = new Triangle(12.34, 54.63);

		Circle c1 = new Circle(12.34);

		Rectangle r1 = new Rectangle(12.34, 45.67);

		printArea(c1);

		printArea(t1);

		printArea(r1);

	}

}
