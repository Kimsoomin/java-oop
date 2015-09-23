package encapsule;

import java.util.Scanner;

/**
 * @file_name : MaxMinMain.java 
 * author : soomin0322@naver.com 
 * date : 2015. 9.22. 
 * story : 최고점, 최저점 구하기
 */
public class MaxMinMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MaxMin maxmin = new MaxMin();
		int[] avgs = new int[5];
		// =====프로그램 시작======
		
		System.out.println("학생들 평균 점수를 입력하면 최고점, 최저점이 출력됩니다.");
		System.out.println("단, 정원은 5명입니다.");

		for (int i = 0; i < avgs.length; i++) {
			avgs[i] = scanner.nextInt();
			}
		System.out.println(maxmin.getMaxMin(avgs));

	}

}