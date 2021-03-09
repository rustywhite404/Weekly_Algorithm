package week2;

import java.util.Scanner;

public class A006 {

	public static void main(String[] args) {
		//정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
		// 나눈 값은 실수, 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력
		//단 0 <= a, b <= 2147483647, b는 0이 아니다.
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println((int)a/b);
		System.out.println(a%b);
		System.out.println(String.format("%.2f",(float)a/b));
		

	}

}
