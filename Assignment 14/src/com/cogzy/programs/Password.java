package com.cogzy.programs;

import java.util.Random;

public class Password {

	public static void main(String[] args) {
		int length = 10;
		System.out.println(generatePassword(length));
	}

	public static char[] generatePassword(int length) {
		System.out.println("Your Password:");
		String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String chars = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String symbols = "!@#$%^&*_=+-/€.?<>)";

		String passwordSymbols = charsCaps + chars + nums + symbols;
		Random rnd = new Random();

		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			password[i] = passwordSymbols.charAt(rnd.nextInt(passwordSymbols.length()));

		}
		return password;
	}
}
