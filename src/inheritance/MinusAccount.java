package inheritance;

public class MinusAccount extends Account {
	private int accountNo; // 계좌번호
	private String ownerName; // 계좌주인
	private int password; // 통장비번
	private int restMoney; // 잔액
	public static final String BANK_NAME = "러쉬앤캐시";
	// 오버라이딩
	
	public MinusAccount() {
		this.accountNo = (int) ((Math.random()*999999)+100001);
	}
	
	public int getAccountNo() {
		return accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public int getPassword() {
		return password;
	}

	public int getRestMoney() {
		return restMoney;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public void setRestMoney(int restMoney) {
		this.restMoney = restMoney;
	}

	public void deposit(int money) {
		/**
		 * 입금 메소드 += 유효성 체크 입금액이 혹시 
		 * 0이나 0보다 작은 금액을 파라미터로 던질 경우 
		 * 에러가 발생하는 것을 막기 위한
		 * 방어코딩
		 */
		if (money > 0) {
			restMoney += money;
		} else {
			System.out.println("에러발생"); 
			restMoney = 0; return;
		}
	}

	public void withdraw(int money) {
		if (money <= 300) {
			restMoney -= money;
		} else {
			System.out.println("금액 초과");
		}

	}

	@Override
	public String toString() {
		return "입출금 계좌\n" 
				+ "[" + BANK_NAME + "]\n" 
				+ "계좌번호:" +accountNo+ "\n" 
				+ "계좌명:" +ownerName+ "\n" 
				+ "비번: ****** \n"
				+ "잔액:" +restMoney+ "으로 통장이 개설되었습니다.";

	}
}

