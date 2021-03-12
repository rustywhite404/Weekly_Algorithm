package week3;

import java.util.Scanner;

public class A002 {

	public static void main(String[] args) {
		
		//1(true) 또는 0(false)이 입력되었을 때, 반대로 출력하는 프로그램을 작성해보자.
		// * 삼항연산자만으로 풀 수 있는 문제인데 boolean 사용법을 익히는 문제 같아서 사용해 봄 
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean result = true;
		
		if(a==0) {
			result = true;
		}else {
			result = false;
		}
		System.out.println((result==true?1:0));
		
		
	}

}
