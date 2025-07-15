package sub4;

/*
 * 날짜 : 2025/07/15
 * 이름 : 이종봉
 * 내용 : 상속(Inheritance) 실습하기
 */


public class InheritTest {
	
	public static void main(String[] args) {
		
		// Car 상속 실습
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		sonata.speedUP(80);
		sonata.turbo();
		sonata.speedDown(20);
		sonata.show();
		
		Truck bongo = new Truck("봉고", "남색", 0, 0);
		bongo.load(100);
		bongo.speedUP(80);
		bongo.speedDown(20);
		bongo.show();
		
		// StockAccount 실습
		StockAccount kb = new StockAccount("KB증권", "101-22-0100", "홍길동", 10000, "삼성전자", 10, 100000);
		kb.deposit(1000000);
		kb.withdraw(50000);
		kb.buy(5, 80000);
		kb.show();
		
		kb.sell(5, 90000);
		kb.show();
		

	
	Doctor doctor = new Doctor("김유신", 23, "소아과");
	Engineer engineer = new Engineer("김순수", 21, "소프트웨어");
	
	doctor.work();
	engineer.work();
		
	}
}
