package p103;

import java.util.Scanner;

public class CoffePrice {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("무슨 커피 드릴까요? ");
		
		String order = scanner.next(); // 주문 읽기
		
		int price = 0;
		
		switch (order) {
		
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500; break;
		case "아메리카노":
			price = 2000; break;
			
			default: System.out.println("메뉴에 없습니다.");
			// switch 문에서 default는 어떤 case에도 해당하지 않을 때 
			// 실행될 코드블록을 정의할 때 사용
		}
		
		if(price !=0) System.out.print(order + "는 "+ price + "원입니다.");
		
		scanner.close();
	
		
	}

}
