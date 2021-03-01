package week2;

import java.util.Scanner;

public class A001 {

	public static void main(String[] args) {
		// 문자열을 정수로 바꾸기
		// 문제 : 문자열 str을 숫자로 변환한 결과를 반환하는 솔루션을 완성하세요.
		// 요구사항 : 
		// 1. str의 길이는 1 이상 6 이하이다.
		// 2. str의 맨 앞에는 부호(+,-)가 올 수 있다.
		// 3. str이 숫자가 아닐 경우 '0'을 반환한다. 
		// 4. str이 0으로 시작할 경우, 0은 제외하고 반환한다.
		// ex) "0a13b" -> 0 / "08513" -> 08513 / "-1234" -> "-1234" 		
		
		
		Scanner sc = new Scanner(System.in);
		boolean output = true; // 숫자인지 아닌지 판별
		
		System.out.println("1이상 6이하의 문자열을 입력해주세요 :");
		String str = sc.nextLine();
		// 입력받은 문자열 str을 숫자로 변환 
		
		if(str.length()>=7||str.length()<0) { // 문자열의 길이가 1이상 6이하가 아닐 경우
			System.out.println("문자열의 길이는 1자리 이상, 6자리 이하여야 합니다.");
		}else {
			
			if(isStringDouble(str)) {// 입력받은 문자열이 숫자일 경우
				
				String num = str.replaceAll("^0+",""); // 첫자리가 0일 경우 정규식으로 제외 				
				System.out.println(num); 
				
			}else {
				System.out.println(0); // 입력받은 문자열이 숫자가 아닐 경우 0 반환
			}
			
		}
		

	}

	private static boolean isStringDouble(String str) {
		try {
	        Double.parseDouble(str);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}

}

