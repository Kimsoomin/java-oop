package encapsule;

import java.util.Scanner;

/**
 * @file_name : PayMain.java author : soomin0322@naver.com date : 2015. 9. 23.
 *            story : 세금 공제한 실급여 환산 프로그램
 */
public class PayMain {
	/*
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다. 이름과 연봉을 입력받아 [연봉 ? 를 받는 ? 님께서 납부할 세금은 ? 만원입니다.]
	 * 로 출력하는 프로그램을 만들어 주세요. 단) 세율이 정권이 바뀔 때 마다 변하니 쉽게 적용가능하게 만들어주세요. 현 정권은 세율이
	 * 9.7%입니다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pay instance = new Pay(0, null);
		String name = null;
		int salary = 0;
		System.out.println("이름을 입력하세요 : ");
		name = scanner.next();
		System.out.println("연봉을 입력하세요 : ");
		salary = scanner.nextInt();
		//===========연산================
		instance.setName(name);
		instance.setSalary(salary);
		instance.setTax();
		System.out.println(instance.toString());
	}

}
