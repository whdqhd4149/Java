package test5;

/*
 * 날짜 : 2025/07/23
 * 이름 : 이종봉
 * 내용 : 예외처리 연습문제
 */


public class Test04 {
	public static void main(String[] args) {
		
		String fileName = "HelloWorld.java";
		
		int idx = fileName.???
				
		String title = fileName.???
		String ext = fileName.???
				
        System.out.println("파일명 : " + title);
		System.out.println("확장자 : " + ext);
		
		String strScores = "60, 72, 82, 86, 92";
		String[] scores = strScores.???
		
		int total = 0;
		
		for(String score : scores) {
			total += Integer.parseInt(???);
		}
		System.out.println("strScores 총점 : " + total);
	}
}
