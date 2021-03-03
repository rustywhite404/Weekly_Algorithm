package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class A003 {

	public static void main(String[] args) {
		// 1~10까지 숫자를 랜덤으로 5개 뽑는데, 중복된 숫자는 제거하세요.
		// 2와 같은 문제지만 좀 더 간결하게 푸는 방법
		
		Set<Integer> set = new HashSet<>(); // Set은 중복을 허용하지 않는 특성이 있다
		while(set.size()<5) { //set의 크기가 0~4면 반복을 끝낸다
			set.add((int) (Math.random()*10+1)); // 같은 값이 들어오면 set은 저장을 하지 않음 -> size가 증가하지 않으므로 다시 반복
		}
		
		List<Integer> list = new ArrayList<>(set); 
		Collections.sort(list); // 생성된 숫자들을 배열에 넣어서 sort 
		System.out.println(list);
	}

}
