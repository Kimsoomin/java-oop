package encapsule;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @file_name : Money.java
 * author     : soomin0322@naver.com
 * date       : 2015. 9. 21.
 * story      : 금액을 입력하면 화폐 단위별로 분류 시키는 문제 
 */
public class Money {
	/**
	 * 예를 들어서 134,530 원 이면,
	 * 거스름돈을 화폐로 표시 해주면 5만원 2매, 1만원 3매, 1천원 4매, 500원 1개, 10원 3개
	 * 표시하고 10원 미만은 절삭  
	 */
	public String[] countMoney(int money) {
		int [] moneyUnit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int [] moneynum = new int[moneyUnit.length];
		String[] results = new String[moneyUnit.length];
		for (int i = 0; i < moneynum.length; i++) {
			moneynum[i] = money / moneyUnit[i];
			money = money % moneyUnit[i];
			results[i] = moneyUnit[i]+ "원:" + moneynum[i];	
		}
		return results;
	
	}
}
