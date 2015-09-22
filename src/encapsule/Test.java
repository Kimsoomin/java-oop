package encapsule;

import java.util.Scanner;

import bean.Money;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Money money = new Money();
		System.out.println("금액 입력");
		int input = scanner.nextInt();
		String[] results = money.countMoney(input);
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);		
		}
	}
			
}
