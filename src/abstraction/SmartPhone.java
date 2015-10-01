package abstraction;

public class SmartPhone extends Product {
	protected String camera, weight;

	public void setSmartphoneInfo(String company, String name, String serialNo, String camera, String weight) { // 구상메소드
		super.setProductInfo(company, name, serialNo);
		this.camera = camera;
		this.weight = weight;
	}

	@Override
	public String display() {
		return "회사명 : "+super.company+" \n" 
				+ "제품명 : "+super.name+" \n" 
				+ "제품고유번호 : "+super.serialNo+" \n"
				+ "카메라 : "+this.camera+" \n" 
				+ "무게 : "+this.weight;
	}

}
