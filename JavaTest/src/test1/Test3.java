package test1;

/*
 *  날짜: 2025/07/09
 *  이름: 이종봉
 *  내용: 자바 자료형 연습문제
 */

public class Test3 {
	public static void main(String[] args) {
		
		int num = 1;
		int result = 0;
	
		
		result = num++;
        System.out.println("result :" + result);
		
		result = ++num;
		System.out.println("result :" + result);
		
		result = num--;
		System.out.println("result :" + result);
		
		result = --num;
		System.out.println("result :" + result);
	}

}
