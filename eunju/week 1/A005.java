package week1;

import java.util.Arrays;
import java.util.Scanner;

public class A005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] date = sc.next().split("\\.");
		
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int day = Integer.parseInt(date[2]);
		
		System.out.printf(String.format("%04d.%02d.%02d", year, month, day));
		
		
		// 위 방법으로 풀기는 했는데 좀 번거롭게 느껴져서 다른 방법을 찾아봤다.
		// String 배열을 int 배열로 변환하는 방법
		
		int[] time = Arrays.stream(date).mapToInt(Integer::parseInt).toArray();
		// 스트림의 mapToInt메서드를 이용한다. 
		// mapToInt : Stream의 요소를 int형으로 변환해 IntStream으로 반환
		
		System.out.printf(String.format("%04d.%02d.%02d", time[0], time[1], time[2]));
		
		
	}

}
