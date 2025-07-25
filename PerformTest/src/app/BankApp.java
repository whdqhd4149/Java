package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {
	
	private List<Account> accounts = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		BankApp app = new BankApp();
		app.start();
		
		System.out.println("프로그램 종료");
	}
	
	public void start() {
		
		boolean running = true;
		
		while(running) {
			printMenu();
			System.out.print("선택>");
			int choice = Integer.parseInt(scanner.nextLine());
			
			switch(choice) {
			case 1 -> createAccount();
			case 2 -> listAccount();
			case 3 -> depositAccount();
			case 4 -> withdrawAccount();
			case 5 -> running = false;
				
			
			default -> System.out.println("올바른 번호를 선택하세요");						
			}
		}
	}
	
	public void printMenu() {
		System.out.println("--------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("--------------------------------------------");		
	}
	
	public void createAccount() {
		
        System.out.println("--------------계좌생성-------------");
        
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
	
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		Account newAccount = new Account(ano, owner, balance);
		accounts.add(newAccount);
		
		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}
	public void listAccount() {
		for (Account acc : accounts) {
			System.out.println("계좌번호: " + acc.getAno() +
			                   ", 계좌주: " + acc.getOwner() +
			                   ", 잔액: " + acc.getBalance());
		}
	}
	public void depositAccount() {
		
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();

		System.out.print("예금액: ");
		int amount = Integer.parseInt(scanner.nextLine());

		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과: 계좌가 존재하지 않습니다.");
			return;
		}

		if (amount < 0) {
			System.out.println("결과: 예금액은 0 이상이어야 합니다.");
			return;
		}

		account.setBalance(account.getBalance() + amount);
		System.out.println("결과: 예금이 성공되었습니다.");
		
		
	}
	public void withdrawAccount() {
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();

		System.out.print("출금액: ");
		int amount = Integer.parseInt(scanner.nextLine());

		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과: 계좌가 존재하지 않습니다.");
			return;
		}

		if (amount < 0) {
			System.out.println("결과: 출금액은 0 이상이어야 합니다.");
			return;
		}

		if (account.getBalance() < amount) {
			System.out.println("결과: 잔액이 부족합니다.");
			return;
		}

		account.setBalance(account.getBalance() - amount);
		System.out.println("결과: 출금이 성공되었습니다.");
		
	}
	public Account findAccount(String ano) {
		for (Account acc : accounts) {
			if (acc.getAno().equals(ano)) {
				return acc;
			}
		}
		return null;
	}
}