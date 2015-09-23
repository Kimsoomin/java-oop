package encapsule;

public class Pay {
	// 멤버 필드
	final double TAX_RATE = 0.097;
	private int salary;		// 인스턴스(의)변수
	private String name;
	private int tax;
	// 멤버 메소드
	
	public Pay(int salary, String name) {
		
	}

	public int getTax() {
		return tax;
	}
	public void setTax() {
		tax = (int) (salary * TAX_RATE);
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "연봉 " + this.salary +"만원을 받는 " + this.name + "님께서 납부할 세금은 " + this.tax + " 만원 입니다";
	}
	

}
