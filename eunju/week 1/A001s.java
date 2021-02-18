package week1;

public class A001s {

	// Q1. 암호해독
	// 모든 알고리즘을 해독할 수 있는 알고리즘 원석을 보유한 알고리즘 제왕 '파이'와 '썬'은
	// 죽기 전, 이 보물에 암호를 걸어 세계 어딘가에 묻어놓았다고 공표했다. 
	// 그가 남긴 문자는 아래와 같다. 
	
	// 섬으로 향하라!
	// "  + -- + - + -  "
	// "  + --- + - +  "
	// "  +  -- + - + -  "
	// "  +  - + - + - +  "
	// 해(1)와 달(0), Code의 세상 안으로!(En-coding)
	
	// 출력 조건 : 문자열 
	
	
	// 문제는 + - 들을 1과 0을 이용해서(2진수) encoding 하라는 뜻 같아.
	// 풀이를 해 보자. 
	public static void main(String[] args) {
		
		// 네 줄이니까 일일이 쓰기보다는 배열에 담자.
		String[] hint = {
				 "  + -- + - + -  ",
				 "  + --- + - +  ",
				 "  +  -- + - + -  ",
				 "  +  - + - + - +  " 
				 };
		
		solution(hint); 
		

	}
	
	static void solution(String[] hint) {
		// String word = hint[0].replace(" ", ""); // 공백들부터 제거해준 다음, 
		// word = hint[0].replace(" ","").replace("+", "1"); // +를 1로 바꿔주고
		// word = hint[0].replace(" ", "").replace("+", "1").replace("-", "0"); // -도 0으로 바꿔준다.
		// int num = Integer.parseInt(hint[0].replace(" ", "").replace("+", "1").replace("-", "0"),2); // 위에서 바꾼 숫자들을 2진수에 맞춰 Integer형으로 변환
		// hint[0] = String.valueOf((char)num); // 숫자를 char타입으로 변환해서 배열에 담고 
		// System.out.println(hint[0]); // 배열을 출력함 
		// 이 로직을 반복하면 된다. 정리해보자 
		
		for(int i=0;i<hint.length;i++) { // i는 hint의 길이만큼 증가 
			int word = Integer.parseInt(hint[i].replace(" ", "").replace("+", "1").replace("-", "0"),2);
			hint[i] = String.valueOf((char)word);
			System.out.println(hint[i]);
			
		}		
					
	}	
	

}
