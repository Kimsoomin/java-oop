package polymophism;

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
				service.open();
				break;
			case 2:
				service.deposit();
				break;
			case 3:
				service.withdraw();
				break;
			case 4:
				service.search();
				break;
			case 5:
				return;
			default:
				break;
			}

		}

	}
}
