package week2;

import java.util.Random;

public class A002 {

	public static void main(String[] args) {
		
		// 1~10까지 숫자를 랜덤으로 5개 뽑는데, 중복된 숫자는 제거하세요.

		int a[] = new int[10]; // 10칸짜리 배열 생성 
		Random random = new Random();
		
		for(int i=0;i<5;i++) { // 숫자를 랜덤으로 5개 뽑기 
			
			a[i] = random.nextInt(10)+1; // a[0]...a[4]에 랜덤 값 삽입 
			for(int j=0;j<i;j++) { 
				if(a[i]==a[j]) { // a[i]와 a[j]을 비교했을 때 값이 같으면 
					i--; // i를 1 빼주어 다시 랜덤을 돌린다. 
				}
			}
		}
		
		for(int b=0;b<5;b++) {
			System.out.println(a[b]);
		}
		
		
	}

}
