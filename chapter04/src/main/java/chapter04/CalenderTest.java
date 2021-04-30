package chapter04;

import java.util.Calendar;

public final class CalenderTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		printDate(cal);

		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 25);
		cal.set(Calendar.DAY_OF_WEEK, 1);
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		printDate(cal);
		
		cal.set(2020,10,10);
		cal.add(Calendar.DATE,100);
		printDate(cal);
	}

	private static void printDate(Calendar cal) {
		
		final String[] DAYS = {"일","월","화","수","목","금","토"};		
		// 년
		int year = cal.get(Calendar.YEAR);

		// 월(0~11 + 1)
		int month = cal.get(Calendar.MONTH);

		// 월
		int date = cal.get(Calendar.DATE);

		// 요일
		int day = cal.get(Calendar.DAY_OF_WEEK);

		// 시
		int hours = cal.get(Calendar.HOUR);

		// 분
		int minute = cal.get(Calendar.MINUTE);

		// 초
		int seconds = cal.get(Calendar.SECOND);

		System.out.printf("%d년 %d월 %d일  %s요일 %d시간 %d초 \n", year, month+1, date,DAYS[day-1], hours, seconds);

	}

}
