package week4;

import java.util.Scanner;

public class A003 {

	public static void main(String[] args) {
		// 점수(정수, 0~100)을 입력받아 평가를 출력해보자. 
		// 90~100 : A
		// 70~89 : B
		// 40~69 : C
		// 0~39 : D 로 평가되어야 한다. 
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		switch(score/10) {
		case 10 : 
		case 9 : 
			System.out.println("A");
			break;
		case 8 :
		case 7 :
			System.out.println("B");
			break;
		case 6 :
		case 5 :
		case 4 :
			System.out.println("C");
			break;
		default :
			System.out.println("D");
			break;
			
		}

	}

}
