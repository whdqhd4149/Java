package test4sub2;

public class Product {
	
	private String productId;
	private String productName;
	private int price;
	private int quantity;
	
	public Product(String productId, String productName, int price, int qualtity){
		
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = qualtity;	    
	}
	
	public void updatePrice(int price) {
		
			this.price = price;
			System.out.println("키보드 가격 수정 됨");
				
	}
	
	public void addStock(int quantity) {
		
		
			this.quantity += quantity;
			System.out.println("키보드 15개 재고 추가 됨");
		
	}
	
	public void printProductInfo() {
		
		System.out.println("상품 ID : " + productId);
		System.out.println("상품이름 : " + productName);
		System.out.println("상품가격 : " + price);
		System.out.println("재고수량 : " + quantity);
			
	}
}
