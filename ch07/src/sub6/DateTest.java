package sub6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 날짜 : 2025/07/22
 * 이름 : 이종봉
 * 내용 : 자바 날짜/시간 클래스 실습하기
 */

public class DateTest {
	
	public static void main(String[] args) {
		
		
		// Date 클래스
		Date date = new Date();
		System.out.println("date : " + date); // .toString() 생략
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String result = sdf.format(date);
		System.out.println("result : " + result);
		
		// Calendar 클래스 : 싱글톤 객체이기 때문에 객체 생성 안됨
		//Calendar car = new Calendar();
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int dt = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%02d-%02d %02d:%02d:%02d", year, month, dt, hour, min, sec);
		
	}
}
