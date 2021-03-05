package basic;

import java.util.Scanner;

public class Algorithm04 {

	public static void main(String[] args) {
		//Scanner로 서울여부 입력 받기
		/*1.서울이지 아닌지 (맞으면 1, 아니면 0)
		  2.인구가 천만이상인지
		  3.두조건을 모두 만족하면 수도 true 출력*/
		//Scanner, 조건문, 분기문, 논리연산자 사용
		
		Scanner s = new Scanner(System.in);
		boolean capital;
		double citizens;
		
		System.out.print("거주하는 곳이 서울입니까? 맞으면 1, 아니면 0 입력 :");
		//분기문 : 만약 ~조건을 만족한다면 ?바로뒤, 만족못한다면 두번째꺼
		capital = (s.nextInt()==1)? true:false;
		
		System.out.print("거주하는 곳의 인구 수 입력(단위:천만) =");
		citizens = s.nextDouble();
		
		//논리연산자 &&(둘다 만족) true, ||(둘중 하나 만족시) true
		if( capital==true && citizens >= 1 ) {
			System.out.println("거주하는 곳은 수도가 맞습니다.");
		}else {
			System.out.println("거주하는 곳은 수도가 아닙니다.");
		}
		
		s.close();
	}

}
