package week1;

import java.util.Scanner;

public class A004 {
	
	// 시간을 시:분 형식으로 입력받고, 
	// 시:분 형태로 출력해보자.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String time = sc.next();
		String clock[] = time.split(":");
		System.out.println(clock[0]+":"+clock[1]);
	}

}
