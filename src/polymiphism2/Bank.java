package polymiphism2;

public interface Bank {
	// 1. 개설
	public String open(String name, String pw);		// 추상메소드
	// 2. 입금
	public String deposit(int in); 
	// 3. 출금
	public String withdraw(int out);
	// 4. 조회
	public String search();


}
