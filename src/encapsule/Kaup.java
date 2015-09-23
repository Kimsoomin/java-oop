package encapsule;

public class Kaup {
	private String name; //
	private double height;
	private double weight;
	private String result;

	// 클래스가 아파트라면
	// 해당부분은 경비실 역할
	// ALT + SHIFT + S => generate getter setter

	public void setResult() {
		int idx = (int) ((weight / (height * height)) * 10000);
		if (idx >= 24) {
			result = "과체중";
		} else if (idx >= 20) {
			result = "정상";
		} else if (idx >= 15) {
			result = "저체중";
		} else if (idx >= 13) {
			result = "마름";
		} else if (idx >= 10) {
			result = "영양실조";
		} else {
			result = "소모증";
		}

	}
	public Kaup() {
		
	}

	public String getResult() {
		return result;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "안녕하세요" + this.name + "님께서는 " + this.result + " 입니다";
	}
}

// get : read, set : write
