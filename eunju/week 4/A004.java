package week4;

import java.util.Scanner;

public class A004 {
	
	// 정수를 입력하는데, 0이 아닐 경우 입력된 정수를 출력하고 0이 입력되면 출력을 중단해보자. 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num!=0) {
			System.out.println(num);
			num = sc.nextInt();
		}

	}

}
