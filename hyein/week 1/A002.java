public class A002 {

	public static void main(String[] args) {
		//숫자 1, 24, 23, 6, 15 중에서 짝수만 출력하기
		
		int[] num = {1, 24, 23, 6, 15};
		
		for (int i = 0; i < num.length; i++) {
			if (num[i]%2==0) {
				System.out.println(num[i]);
			};
		}
	}

}
