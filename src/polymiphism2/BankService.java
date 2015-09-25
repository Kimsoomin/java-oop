package polymiphism2;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;
/**
 * @file_name : BankService.java
 * author     : soomin0322@naver.com
 * date       : 2015. 9. 25.
 * story      : 
 */
public class BankService implements Bank {
	Account account = new Account();
	Scanner scanner= new Scanner(System.in);
		
	@Override
	public String open(String name, String pw) {
		account.accountNo = (int) ((Math.random()*999999)+100001); 
		account.getAccountNo();
		account.setPassword(pw);
		account.setOwnerName(name);
		return account.toString();
	}

	@Override
	public String deposit(int in) {
		if (in > 0) {
			account.setRestMoney(in);
		} else {
			System.out.println("에러발생"); 
			account.setRestMoney(0);
		}
		return "잔액은" +account.getRestMoney();
				
	}

	@Override
	public String withdraw(int out) {
		if (account.getRestMoney() >= out) {
			account.getRestMoney();
		} else {
			System.out.println("잔액 부족");
		}return "잔액은" +account.getRestMoney();
	}

	@Override
	public String search() {
		return "잔액은" +account.getRestMoney() ;
	}
	public String toString() {
		return "입출금 계좌\n" 
				+ "[" + account.BANK_NAME + "]\n" 
				+ "계좌번호:" +account.accountNo+ "\n" 
				+ "계좌명:" +account.ownerName+ "\n" 
				+ "비번: ****** \n"
				+ "잔액:" +account.getRestMoney()+ "으로 통장이 개설되었습니다.";

	}
}
