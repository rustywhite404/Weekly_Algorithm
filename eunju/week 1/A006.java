package week1;

import java.util.Scanner;

public class A006 {
	
	// - 포함 주민번호를 입력받고, 모든 숫자를 한 번에 연결해서 보여주기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String jumin = sc.next();
		String[] word = jumin.split("-");
		
		System.out.println(word[0]+word[1]);
		

	}

}
