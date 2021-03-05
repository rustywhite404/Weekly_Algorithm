package basic;

import java.util.Scanner;

public class Algorithm02 {
	//이름, 거주지, 나이, 체중을 입력받아 출력하기
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("==============================================");
		System.out.println(" 이름, 거주지, 나이, 체중을 띄어쓰기로 분리하여 입력하세요.");
		System.out.println("==============================================");
		
		String name = s.next();
		String addr = s.next();
		int age = s.nextInt();
		double weight = s.nextDouble();
		
		System.out.println("이름은 "+name+"이고 나이는 "+age+"살이고 체중은 "+weight+"kg이며 거주지는 "+addr+"입니다.");
	}

}
