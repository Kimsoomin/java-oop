package encapsule;

import java.util.Scanner;

/**
 * @file_name : MaxMin.java author : soomin0322@naver.com date : 2015. 9. 22.
 *            story : 최고점, 최저점 구하기
 */
public class MaxMin {
	public String getMaxMin(int[] avgs) {
		int max = 0, min = 100;
		String result = "";
		for (int i = 0; i < avgs.length; i++) {
			if (max < avgs[i]) {
				max = avgs[i];

			}
			if (min > avgs[i]) {
				min = avgs[i];
			}

		}
		return result = "최고점:" + max + "최저점:" + min;
	}
}
