package week3;

import java.util.Scanner;

public class A006 {

	public static void main(String[] args) {
		// 두 개의 참 또는 거짓이 입력될 때,
		// 모두 거짓일 때에만 참이 되는 프로그램을 작성하자
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a!=1 && b!=1) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}

}
