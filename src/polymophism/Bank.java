package polymophism;

public interface Bank {
	// 1. 개설
	public void open();		// 추상메소드
	// 2. 입금
	public void deposit(); 
	// 3. 출금
	public void withdraw();
	// 4. 조회
	public void search();

}
