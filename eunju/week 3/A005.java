package week3;

import java.util.Scanner;

public class A005 {

	public static void main(String[] args) {
		// 두개의 참(1) 또는 거짓(0)이 입력될 때,
		// 참/거짓이 서로 같을 때에만 참이 되는 프로그램을 작성하자.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a==b) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}

}
