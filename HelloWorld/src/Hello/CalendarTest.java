package Hello;

import java.util.Scanner;

public class CalendarTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int mon = sc.nextInt();
		showCal(10);
	}

	public static void showCal(int mon) {
		String[] week = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int month = mon;
		int monthDay = getMonthday(month);
		int sDay = getStartday(month);
		System.out.println("         << " + month + " 월달 >>");
		// 요일 타이틀 출력
		for (String str : week) {
			System.out.printf("%4s", str);
		}
//		for (int i = 0; i < week.length; i++) {
//			System.out.print(" " + week[i]);
//		}
		System.out.println();
		// 1일의 위치 지정.
		for (int i = 1; i < sDay; i++) {
			System.out.printf("%4s", "");
		}
		for (int i = 1; i <= monthDay; i++) {
			System.out.printf("%4d", i);
			if ((sDay + i - 1) % 7 == 0)
				System.out.println();
		}

	}

	public static int getStartday(int month) {
		int startDay = 0;
		if (month == 9) {
			startDay = 1; // 일요일
		} else if (month == 10) {
			startDay = 3; // 화요일
		} else if (month == 11) {
			startDay = 6; // 금요일
		} else if (month == 8) {
			startDay = 5; // 목요일
		}
		return startDay;
	}

	public static int getMonthday(int month) {
		int day = 0;
		if (month == 2) {
			day = 28;
		} else if (month <= 7 && month % 2 == 1) {
			day = 31;
		} else if (month >= 8 && month % 2 == 1) {
			day = 31;
		} else {
			day = 30;
		}
		return day;
	}

}
