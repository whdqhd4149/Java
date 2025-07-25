package test6;

public class test04 {
	public static void main(String[] args) {
		
		int index;
		int primes = 0;
		
		for(int i = 2; i < 100; i++) {
			for(index = 2; index < i; index++) {
				if(i % index == 0) {
					??
				}
			}
			
			if(i == index) {
				primes++;
				System.out.printf("%5d%s", i, primes % 10 == 0 ? "\n" : "");
			}
		}
		System.out.printf("\n2부터 100 사이의 소수의 개수 : %개", primes);
	}
}
