package abstraction;

public class Computer extends Product {
	protected String cpu;
	protected String ram;
	protected String hdd;
	
	
	public void setComputerInfo(String company, String name, String serialNo, String cpu, String ram, String hdd){	// 구상메소드 concrete method
		super.setProductInfo(company, name, serialNo);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "제조회사 : "+super.company+" \n"
				+ "제품명 : "+super.name+" \n"
				+ "고유번호 : "+super.serialNo+" \n"
				+ "cpu : "+this.cpu+" \n"
				+ "RAM : "+this.ram+" \n"
				+ "HDD : "+this.hdd;
	}

}
