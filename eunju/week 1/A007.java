package week1;

import java.util.Scanner;

public class A007 {
	
	// 입력 받은 단어를 한 글자씩 출력하기 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		String[] ch = word.split(""); 
		
		for(String i:ch) {
			System.out.println("'"+i+"'");
		}
		
	}

}
