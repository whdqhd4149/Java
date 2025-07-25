package test5;

import java.util.Scanner;

/*
 * 날짜 : 2025/07/23
 * 이름 : 이종봉
 * 내용 : 예외처리 연습문제
 */

class NotFoundException extends Exception{
	public NotFoundException() {
		super("입력한 숫자를 찾을 수 없습니다!");
	}
}

public class Test02 {
	
       public static void searchArray(int find, int[] arr)throws NotFoundException{
		
		for(int i : arr) {
			if(i == find) {
				return;
			}
		}
		throw new NotFoundException();		
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 10};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print
		("찾을 숫자 입력 : ");
		int find = sc.nextInt();
		
		try {
			searchArray(find, arr);
			System.out.println("입력한 숫자를 찾았습니다!");
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}finally {
			sc.close();
		}
		System.out.println("프로그램 종료...");
	}
}
