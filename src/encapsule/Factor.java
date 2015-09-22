package encapsule;

import java.util.Scanner;

/**
 * @file_name : Factor.java 
 * author : soomin0322@naver.com 
 * date : 2015. 9. 22.
 * story : 약수 알고리즘
 */
public class Factor {
	public int[] getFactor(int dest) {
		int count = 0;
		for (int i = 1; i < dest+1; i++) {
			if(dest%i==0) {
				count++;
			}
		}
		int[] temp = new int[count]; 
		count=0;
		for (int i = 1; i < dest+1; i++) {
			if(dest%i==0) {
				temp[count]=i;
				count++;
			}
		}
		return temp;
	}
}
