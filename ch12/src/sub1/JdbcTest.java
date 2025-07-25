package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 날짜 : 2025/07/25
 * 이름 : 이종봉
 * 내용 : 자바 JDBC 실습하기
 */
public class JdbcTest {
	
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "whdqhd4149";
		String pass = "1234";
		
		try {
			// 데이터베이스 접속
		Connection conn= DriverManager.getConnection(host,user,pass);
		
		if(conn != null) {
			System.out.println("접속 성공!");
		}else {
			System.out.println("접속 실패!");
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

}
