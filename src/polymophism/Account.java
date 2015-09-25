package polymophism;

public class Account {
	public int accountNo; // 계좌번호
	public String ownerName; // 계좌주인
	public int password; // 통장비번
	public int restMoney; // 잔액
	public static final String BANK_NAME = "한빛뱅크";

	/**
	 * 생성자를 만드시오 
	 * 단, 통장을 만듦과 동시에 
	 * 은행 이름이 통장 바깥에 새겨지며(상수) 
	 * 계좌번호는 랜덤숫자로 만들어 지며(총 6자리로 합시다) 
	 * 계좌주인의 이름은 새겨지며 비번도 설정합니다. 
	 * 다만, 잔액은 통장이 만들어진 이후에 입금이 되겠지요
	 */
	
	public Account() {
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

	public void withdraw(int money) {
		if (restMoney >= money) {
			restMoney -= money;
		} else {
			System.out.println("잔액 부족");
		}return;
	}
	public void deposit(int money) {
		if (money > 0) {
			restMoney += money;
		} else {
			System.out.println("에러발생"); 
			restMoney = 0; return;
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
