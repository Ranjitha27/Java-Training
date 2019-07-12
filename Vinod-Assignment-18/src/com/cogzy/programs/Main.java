package.com.cogzy.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

//	static int getInt(String message) {
//		System.out.print(message);
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		return sc.nextInt();
//	}

	static String getString(String message) {
		System.out.print(message);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public static void main(String[] args) {
		String ans;
		int y, z, xx;
		y = z = xx = 0;
		String intInputs = "", nonIntInputs = "";
		do {

			String input = "";
			try {
				input = getString("Enter a number: ");
				int num = Integer.parseInt(input);
				xx += num;
				y++;
				intInputs += num + ", ";
			} catch (Exception e) {
				System.out.println("Invalid input; only numbers expected.");
				z++;
				nonIntInputs += input + ", ";
			}
			ans = getString("Do you want to continue? yes/no: ");

		} while (!ans.equalsIgnoreCase("no"));

		System.out.printf("Number of inputs = %d\n", y + z);
		System.out.printf("Number of integer inputs = %d\n", y);
		System.out.printf("Number of non-integer inputs = %d\n", z);
		System.out.printf("Sum of all integer inputs = %d\n", xx);
		System.out.printf("The integer inputs = %s\n", intInputs);

		System.out.println("Bye!");
	}

}
