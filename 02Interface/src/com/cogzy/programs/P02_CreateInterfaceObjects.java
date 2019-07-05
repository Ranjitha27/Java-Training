package com.cogzy.programs;

import com.cogzy.model.Circle;
import com.cogzy.model.Rectangle;
import com.cogzy.model.Shape;
import com.cogzy.model.Triangle;

public class P02_CreateInterfaceObjects {

	public static void main(String[] args) {

		Shape sh;

		Triangle t1 = new Triangle();
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();

		sh = t1;
		sh.printArea();

		sh = c1;
		sh.printArea();

		sh = r1;
		sh.printArea();
	}

}
