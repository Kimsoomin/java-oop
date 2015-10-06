package persen;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @file_name : PersonMain.java author : soomin0322@naver.com date : 2015. 10.6.
 *            story : String 클래스 예제
 */
public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("800101-1234567");
		Person p2 = new Person("800101-1234567");

		Test2 t = new Test2("800101-1234567");
		if (p1.getSsn() == t.getSsn()) {
			System.out.println("정말 상수풀 주소를 참조하는 것이 맞구나");
		} else {
			System.out.println("모든 것이 구라였다.");
		}

		if (p1.equals(p2)) {
			System.out.println("같은 클래스 객체입니다.");
		} else {
			System.out.println("다른 클래스 객체입니다.");
		}
		if (p1.equals(t)) {
			System.out.println("같은 클래스 객체입니다.");
		} else {
			System.out.println("다른 클래스 객체입니다.");
		}

		// Person 클래스에 String 타입의 인자값을
		// 받는 생성자가 없어서 에러가 났습니다.

		// p1과 p2 는 서로 다른 주소이다.
		// But, p1.getSsn() 과 p2.getSsn() 은 서로 같은 주소입니다.

		/**
		 * p1 과 p2가 동일인물인지 레크하는 로직을 완성하시오 삼항연산자로 처리 바랍니다. 현재 2015년입니다. 현재 p1의
		 * 나이는 몇 살입니까? 결과물은 p1는 p2 동일인물이며, 나이는 ** 살입니다.
		 */

		System.out.println(p1.getSsn());

		int ageyear = 0;
		switch (p1.getSsn().charAt(7)) {
		case '1':
		case '2':
			ageyear = 1900;
			break;
		case '3':
		case '4':
			ageyear = 2000;
			break;
		default:
			break;
		}
		int age = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date())) 
				- (Integer.parseInt(p1.getSsn().substring(0, 2)) + ageyear);
		System.out.println(p1 == p2 ? "동일하다" : "동일하지않다");
		System.out.println(p1.getSsn().equals(p2.getSsn()) ? "동일인물이며 나이는" + age + "살입니다." : "동일인물이 아닙니다.");
	}

}

class Person {
	private String ssn; // 주민번호
	private String age; // 나이
	private String name; // 이름

	public Person(String ssn) { // 태어나자 마자 주민번호를 부여 받느다.
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public String getAge() {

		return age;
	}

	public String getName() {
		return name;
	}
	/*
	 * public void setSsn(String ssn) { this.ssn = ssn; }
	 */
	// 주민번호는 수정 불가하므로 setSsn 은 필요없다

	public void setAge(int age) {

	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Person) {
			return true;
		} else {
			return false;
		}
	}
}

class Test2 {
	private String ssn;

	public Test2(String ssn) {
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}
}
