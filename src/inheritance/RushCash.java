package inheritance;

import java.util.Scanner;

import encapsule.Account;

public class RushCash {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MinusAccount macaccount = new MinusAccount();
		Account account = new Account();
		int key = 0, key2 = 0, in2 = 0, out2 = 0, minus = 0, bank = 0;
		System.out.println("은행 선택");
		System.out.println("한빛:1 \t" + "러쉬앤캐쉬:2 \n" + "해당숫자 입력");
		bank = scanner.nextInt();
		switch (bank) {
		case 1:
			System.out.println("이름 입력");
			String name = scanner.next();
			account.setOwnerName(name);
			System.out.println("비번 입력");
			int pw = scanner.nextInt();
			account.setPassword(pw);
			System.out.println(account.toString());
			for (;;) {
				System.out.println("업무 선택: \n" + "1. 입금 2. 출금 3. 잔액조회 4. 나가기");
				key = scanner.nextInt();
				switch (key) {
				case 1:
					System.out.println("입금 금액");
					int in = scanner.nextInt();
					account.deposit(in);
					System.out.println("잔액" + account.getRestMoney());
					break;
				case 2:
					System.out.println("출금 금액");
					int out = scanner.nextInt();
					account.withdraw(out);
					System.out.println("잔액" + account.getRestMoney());
					break;
				case 3:
					System.out.println("잔액" + account.getRestMoney());
					break;
				case 4:
					return;
				default:
					break;
				}

			}
		case 2:
			System.out.println("이름 입력");
			String name2 = scanner.next();
			macaccount.setOwnerName(name2);
			System.out.println("비번 입력");
			int pw2 = scanner.nextInt();
			macaccount.setPassword(pw2);
			System.out.println(macaccount.toString());
			for (;;) {
				System.out.println("업무 선택: \n" + "1. 입금 2. 출금 3. 잔액조회 4. 나가기");
				key2 = scanner.nextInt();
				switch (key2) {
				case 1:
					System.out.println("입금 금액");
					int in = scanner.nextInt();
					macaccount.deposit(in);
					System.out.println("잔액" + macaccount.getRestMoney());
					break;
				case 2:
					System.out.println("출금 금액");
					int out = scanner.nextInt();
					macaccount.withdraw(out);
					System.out.println("잔액" + macaccount.getRestMoney());
					break;
				case 3:
					System.out.println("잔액" + macaccount.getRestMoney());
					break;
				case 4:
					return;
				default:
					break;
				}

			}
		}
	}

}
