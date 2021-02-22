package week1;

import java.util.ArrayList;

public class A002ss {

	public static void main(String[] args) {
		int[] stone = { 5, 2, 7, 4, 8, 7, 4, 8};
		
		Dog[] dogList = {
				new Dog("루비독", "95년생", 3, 4),
				new Dog("피치독", "95년생", 3, 3),
				new Dog("씨-독", "72년생", 2, 1),
				new Dog("코볼독", "59년생", 1, 1)
		};
		
		solution(stone, dogList);

	}
	
	public static void solution(int[] stone, Dog[] dogList) {
		// 성공한 개들 목록을 담을 배열 : 
		ArrayList<String> answer = new ArrayList<String>();
		
		// 개들의 마릿수 만큼 반복한다
		for(Dog i:dogList) {
			
			// 현재지점(0에서 시작) :
			int start = 0;
			
			// 개들의 성공 여부 T/F
			boolean flag = true;
			
			
			// 한 마리의 도전 - 징검다리 돌 숫자만큼 반복
			while(start<stone.length) {
			
				// 현재 지점 += 점프력
				start += i.power;
				
				// 현재 지점>돌 숫자가 되면 
				if(start>stone.length) {
					
					break; // 종료 
					
				}else { // 아닐 경우
					
				System.out.println("현재 지점"+start);
				System.out.println("밟기 전 돌의 내구도: "+stone[start-1]);
				
				// 돌 내구도 -= 체중
				stone[start-1] -= i.kg;
				
				System.out.println("밟고 난 후 내구도: "+stone[start-1]);
				
					// 돌 내구도<0 이 되면 실패 
					if(stone[start-1]<0) {
						flag = false;
						break;
					}				
				}			
						
			}
			// 성공한 개들의 이름을 배열에 담기
			if(flag) {
				answer.add(i.name);
			}
			
			
		}
		
		// 마릿수 만큼의 반복이 끝난 후 결과 :
		System.out.println(answer);
		
	}	
	
}
