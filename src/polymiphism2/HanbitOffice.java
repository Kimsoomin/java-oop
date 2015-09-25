package polymiphism2;

import java.util.Scanner;

public class HanbitOffice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankService service = new BankService();
		AdminService adminService = new AdminService();
		Account account = new Account(1000);

		System.out.println("입금액 입력");
		while (true) {
			System.out.println("관리자화면: \n" 
		+ "1.계좌개설 2.검색(계좌번호) 3.검색(이름) 4.총계좌수 5. 해지 6.종료");
			int key = scanner.nextInt();
			switch (key) {
			case 1:
				System.out.println("계좌번호 입력");
				int accountNo = scanner.nextInt();
				System.out.println("이름입력");
				String name = scanner.next();
				System.out.println("입금액 입력");
				int restMoney = scanner.nextInt();
				adminService.openAccount(accountNo, name, restMoney);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;

			default:
				break;
			}

		}

	}

}
