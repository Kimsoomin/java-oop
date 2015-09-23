package bean;

import java.util.Scanner;

public class MoneyMain2 {
	public static void main(String[] args) {
		/**
		 * 예를 들어서 134,530 원 이면, 거스름돈을 화폐로 표시 해주면 5만원 2매, 1만원 3매, 1천원 4매, 500원
		 * 1개, 10원 3개 표시하고 10원 미만은 절삭
		 */
		Scanner scanner = new Scanner(System.in);
		Money2 money2 = new Money2();
		int money = 0, remainder = 0;
		System.out.println("금액 입력");
		money = scanner.nextInt();
		String[] result = money2.setMoney2(money);
		for (int j = 0; j < result.length; j++) {
			System.out.println(result[j]);
		}

	}
}
