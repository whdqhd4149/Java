package test4sub3;

public class MovieTicket {
	
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;
	
	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
		this.isBooked = false;
	}
	
	public void bookTicket() {
	
		
		if(this.isBooked) {
			System.out.println("이미 예매됨");
			return;					
		}
			
	 this.isBooked =true;
	 System.out.println(movieTitle + ", " + screenTime + ", " + seatNumber + " 예매 완료");
		
	}	
	public void cancelBook() {
		
		if(!this.isBooked) {
			System.out.println("아직 예매 안됨");
			return;
		}
		this.isBooked = false;
		System.out.println(movieTitle + ", " + screenTime+ ", "+seatNumber + " 취소 완료");
	}
	
	public void printTicketInfo() {
		
	
		System.out.println("영화제목 : " + movieTitle);
		System.out.println("상영시간 : " + screenTime);
		System.out.println("좌석번호 : " + seatNumber);
		System.out.println("예매여부 : " + (this.isBooked ? "YES" : "NO") );
		
		
		
		
	}

}
