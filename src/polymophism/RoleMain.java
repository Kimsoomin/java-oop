package polymophism;

/**
 * @file_name : RoleMain.java 
 * author : soomin0322@naver.com 
 * date : 2015. 9. 30.
 * story : 객체지향 특성을 설명하는 간단한(?) 예제
 */
public class RoleMain {
	public static void main(String[] args) {
		/**
		 * 은닉화 : 객체의 속성과 행위를 하나로 묶고, 실제 구현 내용 일부를 외부에 감추어 은닉한다.
		 * 상속   : 새로운 클래스가 기존의 클래스의 자료와 연산을 이용할 수 있게 하는 기능
		 * 추상화 : 불필요한 정보는 숨기고 중요한 정보만을 표현함으로써 프로그램을 간단히 만드는 것
		 * 다형성 : 부모 객체에서 자식 클래스들의 인스턴스를 담는 표현방식
		 * 
		 */
		//	다형성
		Human [] roles = new Man [3];		// 배열이기 때문에 성립 가능
		roles[0] = new Husband();
		roles[1] = new Employee();
		roles[2] = new Father();
		
	// int [] arr = new int[2];
	//	Human [] roles = {husband, emp father}; 이렇게도 가능		
	//  Human h = new Human();	// 인터페이스는 생성자가 없다
		
		for (int i = 0; i < roles.length; i++) {
			roles[i].role();
		}
		
	}
}

interface Human {	// 추상화
	public void role();	
}

class Man implements Human {
	private String name;
	
	public String getName() {	// 은닉화 getter&setter
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void role() {
		System.out.println("남자 역할");
	}
}
class Husband extends Man {	// 상속 extends
	@Override
	public void role() {
		System.out.println("남편 역할");
	}
	public void husbandWorry(){
		System.out.println("남편만의 고민");
	}
}
class Employee extends Man {
	@Override
	public void role() {
		System.out.println("직장인 역할");
	}
	public void EmWorry(){
		System.out.println("직장인의 고민");
	}
}
class Father extends Man{
	@Override
	public void role() {
		System.out.println("아버지 역할");
	}
	public void fatherWorry(){
		System.out.println("아버지의 고민");
	}
}