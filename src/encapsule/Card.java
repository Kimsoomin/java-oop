package encapsule;

public class Card {
	Casino casino = new Casino();
	// 멤버 필드
	public String kind; // 카드의 무늬 (스페이드, 다이아, 하트, 클럽)
	private int number; // 카드의 넘버 (1~13)
	private String name;
	static int WIDTH = 100; 	// 카드의 너비
	static int HEIGHT = 180; 	// 카드의 높이
	// 멤버 메소드
	
	public Card() {
		this.number = (int) ((Math.random()*13)+1);
		this.kind = "하트";
	}

	public String getKind() {
		return kind;
	}

	public int getNumber() {
		return number;
	}

	public void setKind() {
		this.kind = "하트";
	}

	public int setNumber() {
		return this.number = (int) ((Math.random()*13)+1);
	}

	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	
}
