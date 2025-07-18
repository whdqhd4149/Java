package p224;
/*
 * 날짜 : 20225/07/18
 * 이름 : 이종봉
 * 내용 : 교재 p206 예제 4-10 실습
 */

class Sample{
	
	public int a;
	private int b;
	int c; // default
	protected int d;
}

class Sub extends Sample{
	
	public void method() {
		
		d = 10;
	}
}

public class AccessEx {
	
	public static void main(String[] args) {
		
		Sample sample = new Sample();
		
		sample.a = 10;
		//sample.b = 10;
		sample.c = 10;
		
	}

}
