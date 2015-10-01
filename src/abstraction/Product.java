package abstraction;
/**
 * @file_name : Product.java
 * author     : soomin0322@naver.com
 * date       : 2015. 10. 1.
 * story      : 제품을 추상클래스로 만든 예제
 */
public abstract class Product {
//	public final String A = "a";	// 상수이기 때문에 public 선언
	protected String company;
	protected String name;
	protected String serialNo;
	
	public void setProductInfo(String company, String name, String serialNo){	// 구상메소드 concrete method
		this.company = company;		// 생성자가 하는 역할을 하는 셈
		this.name = name;
		this.serialNo = serialNo;
	}
	public abstract String display(); // 추상메소드 abstract method(바디가 없기 때문에)

}
