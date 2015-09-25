package polymiphism2;

import java.util.Scanner;

import encapsule.Account;

public class HanbitBank {
	public static void main(String[] args) {
		BankService service = new BankService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("입금액 입력");
		while (true) {
			System.out.println("동작선택: \n" 
					+"1.계좌개설 2.입금 3.출금 4.조회 5.종료");
			int key = scanner.nextInt();
			switch (key) {
			case 1:
				System.out.println("이름 입력");
				String name = scanner.next();
				System.out.println("비번 입력");
				String pw = scanner.next();
				service.open(name, pw);
				System.out.println(service.toString());
				break;
			case 2:
				System.out.println("입금 금액");
				int in = scanner.nextInt();
				service.deposit(in);
				System.out.println(service.account.getRestMoney());
				break;
			case 3:
				System.out.println("출금 금액");
				int out = scanner.nextInt();
				service.withdraw(out);
				System.out.println(service.account.getRestMoney());
				break;
			case 4:
				System.out.println(service.account.getRestMoney());
				break;
			case 5:
				return;
			default:
				break;
			}

		}

	}
}
