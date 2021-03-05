package basic;

import java.util.Scanner;

public class Algorithm03 {

	public static void main(String[] args) {
		//원의 반지름을 입력 받아 원의 면적 구하기
		
		Scanner s = new Scanner(System.in);
		final double PI = 3.14;
		double radius; //반지름
		double area; // 면적
		
		System.out.print("원의 반지름 입력 :");
		radius = s.nextDouble(); //반지름 입력받기 ( 10.0이런식으로 받음)
		
		area = radius * radius * PI; 
		System.out.print("원의 면적 : "+area);
		
		s.close();
	}

}
