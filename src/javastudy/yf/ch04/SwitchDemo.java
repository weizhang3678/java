package javastudy.yf.ch04;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 18, 2020 5:49:26 PM
 * 
 */

public class SwitchDemo {

	private static void monthWithoutBreak(int month) {

		String monthString;
		switch (month) {
		case 1:
			monthString = "January";
		case 2:
			monthString = "February";
		case 3:
			monthString = "March";
		case 4:
			monthString = "April";
		case 5:
			monthString = "May";
		case 6:
			monthString = "June";
		case 7:
			monthString = "July";
		case 8:
			monthString = "August";
		case 9:
			monthString = "September";
		case 10:
			monthString = "October";
		case 11:
			monthString = "November";
		case 12:
			monthString = "December";
		default:
			monthString = "Invalid month";
		}
		System.out.println(monthString);

	}

	public static void month(int month) {
		String monthString;
		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "Invalid month";
			break;
		}
		System.out.println(monthString);
	}

	public static void main(String[] args) {

		monthWithoutBreak(7);
		month(7);
	}
}
