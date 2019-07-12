package com.cogzy.programs;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class A8 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of sin");
		int sin = Integer.parseInt(reader.readLine());

		double radians = sin * Math.PI / 180;
		System.out.println(radians);

	}

}
