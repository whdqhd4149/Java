package test3;

/* 
 * 날짜 : 20225/07/16
 * 이름 : 이종봉
 * 내용 : 추상클래스 연습문제
 */



abstract class Shape{
	public abstract void draw();
}

class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("draw Triangle!");
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("draw Circle!");
	}
}
public class Test09 {
	
	public static void main(String[] args) {
		
		Test09 here = new Test09();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
		
	}
	
	public void draw(Shape obj) {
		obj.draw();
	}
}
