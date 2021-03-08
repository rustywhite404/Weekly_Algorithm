package week2;

import java.util.Scanner;

public class A005 {

	public static void main(String[] args) {
		// 정수 2개(a, b) 를 입력받아 a를 b로 나눈 몫을 출력해보자.
		//단, -2147483648 <= a <= b <= +2147483647, b는 0이 아니다.
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println((int)a/b);

	}

}
