package bean;

/**
 * @file_name : Money.java author : soomin0322@naver.com date : 2015. 9. 23
 *            story : 금액을 입력하면 화폐 단위별로 분류 시키는 문제
 */
public class Money2 {
	public String[] setMoney2(int money) {
		int[] moneyUnit = { 50000, 1000, 5000, 1000, 500, 100, 50, 10 };
		int[] moneynum = new int[moneyUnit.length];
		String[] result = new String[moneyUnit.length];
		for (int i = 0; i < moneyUnit.length; i++) {
			moneynum[i] = money / moneyUnit[i];
			money = money % moneyUnit[i];
			result[i] = moneyUnit[i] + " 원: " + moneynum[i] + "매";
		}
		return result;
	}

}
