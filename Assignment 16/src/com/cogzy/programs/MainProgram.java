package com.cogzy.programs;

import com.cogzy.model.Person;
import com.cogzy.model.Staff;
import com.cogzy.model.Student;

public class MainProgram {

	public static void main(String[] args) {

		Person[] people = { new Student("Shyam", "Bangalore, Karnataka", "Java fundamentals", 2010, 4500.0),
				new Staff("Anand", "Bangalore, Karnataka", "Delhi Public school", 35000.0),
				new Staff("Umesh", "Bangalore, Karnataka", "National Public school", 42000.0),
				new Student("Suresh", "Hassan, Karnataka", "Java fundamentals", 2012, 4750.0),
				new Student("Kiran", "Vasco, Goa", "Reactjs", 2017, 12500.0) };

		for (Person p : people) {
			if (p instanceof Staff) {
				Staff stf = (Staff) p;
				stf.getSchool();
				stf.getPay();
				System.out.println("Staff [name = " + stf.getName() + ", address = " + stf.getAddress() + ", school = "
						+ stf.getSchool() + ", pay = " + stf.getPay() + " ]");

			} else if (p instanceof Student) {
				Student std = (Student) p;
				std.getProgram();
				std.getYear();
				std.getFee();
				System.out.println("Student [name = " + p.getName() + ", address = " + p.getAddress() + " , program = "
						+ std.getProgram() + ", year = " + std.getYear() + ", fee = " + std.getFee() + "]");

			}

		}

	}
}