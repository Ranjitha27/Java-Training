package com.cogzy.programs;

import com.cogzy.model.Person;

public class CreatePersonObject {

	public static void main(String[] args) {
		Person p1;

		p1 = new Person();
		p1.setName("Raj");
		p1.setHeight(168);
		p1.setWeight(68);
		
		Person p2 = new Person("Ranju");
		Person p3 = new Person("Pai", 150, 50);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}

