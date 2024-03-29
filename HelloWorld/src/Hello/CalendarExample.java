package Hello;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력하세요.");
		int year = sc.nextInt();
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();
		getCal(year, month);
	}

	public static void getCal(int year, int month) {
		Calendar cal = Calendar.getInstance();
		int translatedMonth = month - 1;
		cal.set(year, translatedMonth, 8);
		String[] week = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int monthDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int sDay = cal.get(Calendar.DAY_OF_WEEK);
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

//		System.out.println("년: "+cal.get(Calendar.YEAR));
//		System.out.println("월: "+cal.get(Calendar.MONTH));
//		System.out.println("요일: "+cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("일: "+ cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("===============");
//		cal.set(2019,0,1);
//		System.out.println("년: "+cal.get(Calendar.YEAR));
//		System.out.println("월: "+cal.get(Calendar.MONTH));
//		System.out.println("요일: "+cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("일: "+ cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("전체일수: " +cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		}
	}
}
