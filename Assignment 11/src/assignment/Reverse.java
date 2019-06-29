package assignment;

import java.util.Scanner;

public class Reverse {

	public static String reverse(String sentence) {

		String[] words = sentence.split("\\s");

		String outputString = "";

		for (int i = words.length - 1; i >= 0; i--) {
			outputString = outputString + words[i] + " ";

		}
		return outputString;

	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter sentence : ");

		String sentence = sc.nextLine();

		String outputString = reverse(sentence);

		System.out.println("Input string : " + sentence);

		System.out.println("Output String : " + outputString);

	}

}
