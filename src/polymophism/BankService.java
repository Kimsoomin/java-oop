package polymophism;

import java.util.Scanner;

public class BankService implements Bank {
	Account account = new Account();
	Scanner scanner= new Scanner(System.in);
		

	@Override
	public void deposit() {
		System.out.println("입금 금액");
		int in = scanner.nextInt();
		account.deposit(in);
		System.out.println("잔액" + account.getRestMoney());
	
	}

	@Override
	public void withdraw() {
		System.out.println("출금 금액");
		int out = scanner.nextInt();
		account.withdraw(out);
		System.out.println("잔액" + account.getRestMoney());
	}

	@Override
	public void search() {
		System.out.println("잔액" + account.getRestMoney());
	}

	@Override
	public void open() {
		System.out.println("이름 입력");
		String name = scanner.next();
		account.setOwnerName(name);
		System.out.println("비번 입력");
		int pw = scanner.nextInt();
		account.setPassword(pw);
		System.out.println(account.toString());
		
	}
}
