import java.util.Scanner;

public class A005 {
    public static void main(String[] args) {
        //비만 계산 방법인 BMI지수 = 몸무게(kg) / (신장(m) * 신장(m))이다.
        //BMI를 계산해 저체중인지 과체중인지 정상 체중인지를 출력하는 프로그램.
        //BMI가 18.5 미만이면 저체중, 23이상이면 과체중이다.
        Scanner scanner = new Scanner(System.in);

        //책 정답 (Scanner를 사용안한 방법)
        double height = 1.73;
        double weight = 25.0;

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("저체중입니다.");
        } else if (bmi >= 23) {
            System.out.println("과체중입니다.");
        } else {
            System.out.println("정상체중입니다.");
        }

        //내 정답
//        double weight = 0;
//        double height = 0;
//        double bmi = 0;
//
//        System.out.println("몸무게를 입력하세요.");
//        try {
//            weight = scanner.nextDouble();
//
//            System.out.println("키를 입력하세요.");
//            try {
//                height = scanner.nextDouble();
//                bmi = weight/(height*height/10000); //보통 키는 cm로 말하니까
//            } catch (Exception e) {
//                height = 0;
//            }
//        } catch (Exception e) {
//            weight = 0;
//        }
//
//        if (bmi > 0) {
//            if (bmi < 18.5) {
//                System.out.println("몸무게는 " + weight + "kg");
//                System.out.println("키는 " + height + "cm");
//                System.out.println("저체중입니다.");
//            } else if (bmi >= 23) {
//                System.out.println("몸무게는 " + weight + "kg");
//                System.out.println("키는 " + height + "cm");
//                System.out.println("과체중입니다.");
//            } else {
//                System.out.println("몸무게는 " + weight + "kg");
//                System.out.println("키는 " + height + "cm");
//                System.out.println("정상체중입니다.");
//            }
//        } else {
//            System.out.println("잘못된 입력입니다.");
//        }
    }
}
