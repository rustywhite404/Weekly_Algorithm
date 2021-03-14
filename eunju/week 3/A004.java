package week3;

import java.util.Scanner;

public class A004 {

	public static void main(String[] args) {
		// 두 개의 참(1) 또는 거짓(0) 이 입력될 때,
		// 하나라도 참이면 참을 출력하는 프로그램을 작성해보자.
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a==1 || b==1) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}

}
