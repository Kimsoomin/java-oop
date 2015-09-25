package encapsule;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
		int key = 0;
		System.out.println("이름 입력");
		String name = scanner.next();
		account.setOwnerName(name);
		System.out.println("비번 입력");
		int pw = scanner.nextInt();
		account.setPassword(pw);
		System.out.println(account.toString());
		
		for (;;) {
			System.out.println("업무 선택: \n"
					+"1. 입금 2. 출금 3. 잔액조회 4. 나가기");
			key = scanner.nextInt();
			switch (key) {
			case 1:
				System.out.println("입금 얼마?");
				int in = scanner.nextInt();
				account.deposit(in); 
				System.out.println("잔액"+account.getRestMoney());break;
			case 2:
				System.out.println("출금 얼마");
				int out = scanner.nextInt();
				account.withdraw(out);
				System.out.println("잔액"+account.getRestMoney()); break;
			case 3:
				System.out.println("잔액"+account.getRestMoney()); break;
			case 4:
				return;
			default:
				break;
			}
		}
		

	}
	
}
