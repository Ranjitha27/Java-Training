package com.cogzy.programs;

public class Calendar {

	private static int dayOfWeek(int day, int month, int year) {
		// should return 0 to 6 for sunday to saturday
		// 6/7/2019
		int jd = 0;
		for (int y = 1900; y < year; y++) {
			jd += isLeapYear(y) ? 366 : 365;
		}

		for (int m = 1; m < month; m++) {
			jd += maxDaysInYear(m, year);
		}

		jd += day;

		return jd % 7;
	}

	private static int maxDaysInYear(int month, int year) {
		switch (month) {
		case 2:
			return isLeapYear(year) ? 29 : 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 31;
		}
	}

	public static int printCalendar(int month, int day, int year) {

		// Given the month, day, and year, return which day of the week it falls on
		// according to the Gregorian calendar. For month, use 1 for January, 2 for
		// February, and so forth. Returns 0 for Sunday, 1 for Monday, and so forth

		int y = year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31 * m) / 12) % 7;
		return d;
	}

	/**
	 * @param year
	 * @return
	 */
	public static boolean isLeapYear(int year) {
		return (year % 400 == 0 || (year % 4 == 0) && (year % 100 != 0));
	}

	public static void main(String[] args) {

//		int month = Integer.parseInt(args[0]);
//		int year = Integer.parseInt(args[1]);
		int month = 7, year = 2019;

		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (month == 2 && isLeapYear(year))
			days[month] = 29;

		System.out.println("   " + months[month] + " " + year);
		System.out.println(" S  M Tu  W Th  F  S");

//		int d = Printcalendar(month, 1, year);
		int d = dayOfWeek(1, month, year);

		for (int i = 0; i < d; i++)
			System.out.print("   ");
		for (int i = 1; i <= days[month]; i++) {
			System.out.printf("%2d ", i);
			if (((i + d) % 7 == 0) || (i == days[month]))
				System.out.println();
		}

	}
}
