package week3;

import java.util.Scanner;

public class A001 {

	public static void main(String[] args) {
		// 입력 받은 두 정수 a, b를 비교하여
		// a와 b가 같으면 1, 같지 않으면 0을 출력하는 프로그램을 작성하자. 
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = (a>b)?1:0;
		System.out.println(result);
	}

}
