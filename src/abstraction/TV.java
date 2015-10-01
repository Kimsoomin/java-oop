package abstraction;

public class TV extends Product{
	protected String size;
	protected String screen;
	
	public void setTvInfo(String company, String name, String serialNo, String size,
			String screen) {
		super.setProductInfo(company, name, serialNo);
		this.size=size;
		this.screen=screen;
	}

	@Override
	public String display() {
		String result = "제조회사 : "+super.company+" \n "
				+ "제품명 : "+super.name+" \n "
				+ "고유번호 : "+super.serialNo+" \n"
				+ "인치 : "+this.size+" \n "
				+ "화면 : "+this.screen;
		
		return result;
	}

}
