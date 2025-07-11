package p124;

public class DoWhileSample {
	public static void main(String[] args) {
		char c = 'a'; //char 하나의 문자 ex) 알파벳a,  숫자1 , 한글 가, 특수문자 !
		
		do {
			System.out.print(c);
			c = (char) (c + 1); // 영문의 경우 1을 더하면 다음 문자의 코드 값 
		} while (c <= 'z');
	}

}
