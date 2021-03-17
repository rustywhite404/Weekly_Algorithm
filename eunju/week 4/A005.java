package week4;

import java.util.Scanner;

public class A005 {
	
	//정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num>0) {
			System.out.println(num);
			--num;
		}

	}

}
