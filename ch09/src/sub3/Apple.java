package sub3;

import java.io.Serializable;

public class Apple implements Serializable{ // 직렬화를 위해 serializable 인터페이스 구현
	
	private String country;
	private int price;
	
	
	public Apple(String country, int price) {
		super();
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}

	public void show() {
		System.out.println("원산지 : " + country);
		System.out.println("가격 : " + price);
	}

}
