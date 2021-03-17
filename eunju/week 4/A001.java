package week4;

import java.util.Scanner;

public class A001 {

	public static void main(String[] args) {
		// 세 정수 A, B, C가 입력되었을 때 짝수만 출력해보자.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a%2==0) {
			System.out.println(a);
		}
		if(b%2==0) {
			System.out.println(b);
		}
		if(c%2==0) {
			System.out.println(c);
		}

	}

}
