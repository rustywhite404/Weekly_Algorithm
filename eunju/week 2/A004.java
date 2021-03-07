package week2;

import java.util.Scanner;

public class A004 {

	public static void main(String[] args) {
		// 정수 1개를 입력받고, 1을 더해 출력해보자.
		// 단, -2147483648 ~ +2147483647의 범위로 입력된다. 
		
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		
		System.out.println(num+1);

	}

}
