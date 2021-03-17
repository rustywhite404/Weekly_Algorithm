package week4;

import java.util.Scanner;

public class A006 {
	// 1부터 n까지, 1부터 m까지 숫자가 적힌
	// 서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numf = sc.nextInt();
		int nums = sc.nextInt();
		
		for(int i=1;i<=numf;i++) {
			for(int j=1;j<=nums;j++) {
				System.out.println(i+" "+j);
			}
		}

	}

}
