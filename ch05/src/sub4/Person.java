package sub4;
/* 
person 클래스
<속성>
-name (String),
-age (int)
<생성자>
-모든 인스턴스 변수 초기화
<메소드>
-work() : 기본적으로 "Person is working" 출력
-introduce() : "새 이름은 [name] 이고 나이는 [age]세 입니다." 출력


Person 클래스를 상속받아 Doctor,Engineer 클래스 정의
Doctor 클래스
<속성>
-specialty (String)
<생성자>
-모든 인스턴스 변수 초기화
<메서드>
-Work()
"제 이름은[name] 이고 나이는 [age]세 입니다."출력
"저는 의사이며 전공은 [specialty]입니다."출력
Engineer 클래스
<속성>
-field (String)
<생성자>
-모든 인스턴스 변수 초기화
<메서드>
-work()
 "제 이름은[name] 이고 나이는 [age]세 입니다."출력
 "저는 [field] 엔지니어."출력
*/
	
public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public void work() {
		System.out.println("Person is working");
		
	}
	
	public void introduce() {
		System.out.println("이름은 ["+name+"]이고, 나이는 ["+age+"]세 입니다 :");
	}
	
	
	
	

}
