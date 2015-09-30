package polymophism2;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;
/**
 * @file_name : BankService.java
 * author     : soomin0322@naver.com
 * date       : 2015. 9. 25.
 * story      : 
 */
public class BankService implements Bank{
	
	private Account account = new Account(); //공식 가져오는 곳


	@Override // deposit
	public String deposit(int inMoney) { // 입금
		account.setRestMoney(inMoney + account.getRestMoney());
		return ("잔액은: "+account.getRestMoney());
	
	}
	// 한 + 영 동시에 사이트 제작시  balance is
	public String deposit(int inMoney,String str) { // 입금
		account.setRestMoney(inMoney + account.getRestMoney());
		return ("잔액은: "+account.getRestMoney());
	
	}

	@Override
	public String withdraw(int outMoney) { // 출금
		String Massage = "";

		if (account.getRestMoney() - outMoney < 0) {
			Massage = "잔액이 부족합니다. 다시입력해주세요";
		}

		else {
			account.setRestMoney(account.getRestMoney()-outMoney);
			Massage = ("잔액: " + account.getRestMoney());
		}
		return Massage;
	}

	@Override
	public String search() { // 잔액조회
		
		return "잔액은: " +account.getRestMoney();

	}

	@Override
	public String open(String accountName, String password) { // 계좌 개설
		
		int random = (int) ((Math.random()*999999)+100000);
		
		return  account.BANK_NAME+"\n"
				+"계좌번호: "+random+"\n"
				+"이름: "+ ""+"\n"
				+"비밀번호: *******\n"
				+"잔액: "+account.getRestMoney();
		
	}
}
