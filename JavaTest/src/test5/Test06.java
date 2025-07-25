package test5;

import java.util.Random;

/*
 * 날짜 : 2025/07/23
 * 이름 : 이종봉
 * 내용 : 컬렉션 리스트 연습문제
 */

public class Test06 {
	
	public static void main(String[] args) {
		// 60 ~ 100 사이 임의의 수 10개를 더하므로 결과값이 항상 다름
		printList(createList());
	}
	
	public static printList(??? scoreList) {
		int total = 0;
		int size = scoreList.???
				
		for(int i=0 ; i < size ; i++) {
			int score = scoreList.???
			total += score;
			System.out.println(score);
			
			if(i == size -1) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}
		}
		System.out.println(total);
		
	}
	
	public static ???? createList(){
		???  scoreList = new ArrayList<>();
		Random rand = new Random();
		
		for(int i=1 ; i <= 10 ; i++) {
			// 60 ~ 100 사이 임의의 수
			int num = rand.nextInt(41) + 60;
			scoreList.add(num);
		}
		return scoreList;
	}

}
