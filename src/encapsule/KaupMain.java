package encapsule;

import java.util.Scanner;

/**
 * @file_name : Kaup.java author : soomin0322@naver.com date : 2015. 9. 23.
 *            story : 카우프지수
 */
public class KaupMain {
	/**
	 * To. 개발자님 사람의 이름을 입력하고, 몸무게, 키를 입력하면 해당 사람의 상태가 비만인지 저체중인지 알려주는 카우프 프로그램을
	 * 만들어주세요. 카우프 지수 구하는 공식은 몸무게를 키의 제곱으로 나눈 후 int idx = (int) (weight /
	 * (height*height))*10000 10000을 곱한 인덱스값이랍니다.
	 * 
	 * 그 인덱스 결과가 30이상이면 비만 24이상이면 과체중 20이상이면 정상 15이상이면 저체중 13이상이면 마름 10이상이면 영양실조
	 * 그 미만이면 소모증이랍니다.
	 * 
	 * 어플리케이션 재작 바랍니다.
	 */

	public static void main(String[] args) {
		Kaup instance = new Kaup();					// 인스턴스 변수(참조변수==객체)
		Scanner scanner = new Scanner(System.in);	// 인스턴스 변수(참조변수==객체)
		String name = ""; // 지역변수(로컬변수)
		double height = 0.0, weight = 0.0;
		// -------------------------
		System.out.println("이름");
		name = scanner.next();
		System.out.println("키");
		height = scanner.nextDouble();
		System.out.println("몸무게");
		weight = scanner.nextDouble();
		// --------연산(알고리즘)----------
		instance.setName(name);
		instance.setHeight(height);
		instance.setWeight(weight);
		instance.setResult();
		// --------값을 출력-----------
		System.out.println(instance.toString());
	}
}
