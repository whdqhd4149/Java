package sub2;

/* 문제1. 아래 요구사항을 충족하는 Book 클래스를 정의하세요
 
 <속성> 
 - title (String) : 책 제목
 - author (String) : 저자 이름
 - isbn (String) : ISBN 번호
 - availableCopies (int) : 이용 가능한 복사본 수
 
 <생성자>
 - 모든 인스턴스 변수를 초기화하는 생성자
 
 <메서드>
 borrowBook()
 - 이용 가능한 복사본이 있으면 availableCopies를 1감소시키고 true를 반환
 - 이용 가능한 복사본이 없으면 false를 반환
 
 returnBoon()
 - availableCopies를 1증가
 
 show()
 - 모든 인스턴스 변수의 값을 출력
 
 <Getter, Setter>
 - 각 인스턴스 변수에 대한 getter와 setter 메서드 정의
 */
public class Book {
	
	// 속성
	private String title;
	private String author;
	private String isbn;
	private int availableCopies; 
	
	// 생성자
	public Book(String title, String author, String isbn, int availalbeCopies) {
	    this.title = title;
	    this.author = author;
	    this.isbn = isbn;
	    this.availableCopies = availableCopies;
		
	}
	
	//메서드
	public boolean borrowBook() {
		
		if(availableCopies > 0) { // 이용가능한 복사본(도서)이 있으면
             
			availableCopies--;
			return true;			
		}else {
			return false;
		}
	}

	public void returnBook() {
		availableCopies++;
	}
		
		public void show() {
			System.out.println("도서명 : " + this.title);
			System.out.println("지은이 : " + this.author);
			System.out.println("도서번호 : " + this.isbn);
			System.out.println("이용 가능한 복사본 : " + this.availableCopies);
			
		
		}		
		public String getTitle() {
			this.title;
		}
		public String getauthor() {
			this.author;
		}	
		public String getisbn() {
			this.isbn;
		}	
		public String getavailableCopies() {
			this.availableCopies;
		}
		
		
	
	Book book1 = new Book("삼국지", "나관중", "10001", 10);
	
	book1.show();
	
	boolean isOk = book1.borrowBook();
	
	if(isOk) {
		System.out.println(book1.getTitle() + "도서 대출 성공!");
		
	}else {
		System.out.println(book1.getTitle() + "도서 대출 실패!");
	}
	
	book1.show();
	
	Book book2 = new Book("명품 Java", "황기태", "10002", 1);
	
	boolean isOk1 = book2.borrowBook();
	boolean isOk2 = book2.borrowBook();
	
	if(isOk2) {
		System.out.println(book2.getTitle() + "도서 대출 성공!");
		
	}else {
		System.out.println(book2.getTitle() + "도서 대출 실패!");
	}
	
	book2.show();

}
}