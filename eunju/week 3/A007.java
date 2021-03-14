package week3;

import java.util.Scanner;

public class A007 {

	public static void main(String[] args) {
		// 입력된 세 정수 a, b, c 중 가장 작은 값을 출력하는 프로그램을 작성하자.
		// 단, 조건문을 사용하지 않는다. 
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println((a>b?b:a)<c?(a>b?b:a):c);

	}

}
