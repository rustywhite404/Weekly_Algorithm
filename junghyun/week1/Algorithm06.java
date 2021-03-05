package basic;

import java.io.Console;
import java.util.Scanner;

public class Algorithm06 {

	public static void main(String[] args) {
		// switch ~case~break를 이용한 점수에 따른 등급표시
		Scanner s = new Scanner(System.in);
		
		int score;
		char grade;
		System.out.print("학생점수를 입력해주세요(0~100):");
		score = s.nextInt();
		
		switch(score/10) { //몫을 구해서 점수구분
		case 10 :
		case 9 :
			grade ='A';
			break;
		
		case 8 :
			grade = 'B';
			break;
			
		case 7 :
			grade = 'C';
			break;
		
		default :
			grade = 'F';
			break;
		}
		
		System.out.println("학생의 등급은 "+grade+"입니다.");
		s.close();
	}

}
