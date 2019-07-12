package com.cogzy.programs;

import com.cogzy.model.Person;

public class P02_CreatePersonArray {

	public static void main(String[] args) {
		Person[] people;
		people = new Person[5];
		people[0] = new Person("Ranju", 168, 68.0);
		people[1] = new Person("Rajendra", 173, 70.4);
		people[2] = new Person("Theju", 165,59.2);

		for (Person p : people) {
			System.out.println(" p is : " + p);
		}

	}

}
