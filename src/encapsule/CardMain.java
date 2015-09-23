package encapsule;

import java.util.Scanner;

/**
 * @file_name : CardMain.java author : soomin0322@naver.com date : 2015. 9. 23.
 *            story : 트럼프 게임
 */
public class CardMain {
	/**
	 * 무늬는 하트로 동일 두 카드의 숫자를 비교해서 더 높은 수의 카드가 이기는 게임
	 * 
	 * 1 ~ 10 까지의 정수 난수 구하기 int n = (int)(Math.random() * 10) + 1;
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력");
		String name1 = scanner.next();
		String name2 = scanner.next();
		Card p1 = new Card();
		Card p2 = new Card();
		p1.setName(name1);
		p2.setName(name2);
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		Casino casino = new Casino(p1, p2);
		// 클래스 객체= new 생성자(인자)
		// 카지노 생성자 인자로 카드 객체 두개를 집어넣어라
		// 카지노 생성자에서 카드 객체 두개의 숫자를 비교해서
		// 위너 루저 인스턴스 변수에 할당하고
		// toString 으로 출력해라.
		System.out.println(casino.toString());

	}

}
