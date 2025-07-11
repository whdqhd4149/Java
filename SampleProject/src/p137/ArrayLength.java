package p137;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		int intArray[] = new int[5]; // 배열의 선언과 생성
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 입력하세요>>"); // 숫자기 때문에 ln 삭제. print
		for(int i=0; i<intArray.length; i++) // intArray => intlength 5개(0~4)
			intArray[i] = scanner.nextInt(); // 키보드에서 입력받은 정수 저장. 콘솔에 직접 입력
		
		for(int i=0; i<intArray.length; i++)
			sum += intArray[i]; // 배열에 저장된 정수 값 더하기
		
		System.out.print("평균은 " + (double)sum/intArray.length);
		scanner.close();
		
	}

}
