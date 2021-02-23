package week1;

import java.util.Scanner;

public class A003 {
	
	// 두 개의 문자(ASCII CODE)를 입력 받고, 순서를 바꿔서 출력해보자.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);
		
		System.out.printf("%c %c", b, a);

	}

}
