package encapsule;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
		System.out.println("이름 입력");
		String name = scanner.next();
		account.setOwnerName(name);
		System.out.println("비번 입력");
		int pw = scanner.nextInt();
		account.setPassword(pw);
		System.out.println(account.toString());
		System.out.println("입금 얼마?");
		int in = scanner.nextInt();
		account.deposit(in);
		System.out.println("출금 얼마");
		int out = scanner.nextInt();
		account.withdraw(out);
		System.out.println(account.getRestMoney());

	}
}
