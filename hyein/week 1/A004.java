import java.util.Scanner;

public class A004 {
    public static void main(String[] args) {
        //양계장에서 닭이 낳은 달걀의 수에 따라 포장에 필요한 계란판의 수를 계산하는 프로그램.
        //달걀 30개당 하나의 계란판이 필요하다고 할 때
        //계란판이 필요하지 않은 경우에는 "계란판이 필요하지 않습니다."라는 문구를 출력하고
        //필요한 경우에는 "총 x개의 계란판이 필요합니다."라는 문구를 출력하세요.

        Scanner scanner = new Scanner(System.in);

        //책 정답
        System.out.println("총 달걀의 수를 입력하세요.");

        int eggCartonSize = 30;
        int totalEggs = 0;

        String input = scanner.nextLine();

        try {
            totalEggs = Integer.parseInt(input);
            if (totalEggs < 30) {
                System.out.println("계란판이 필요하지 않습니다");
            } else {
                int totalEggCartons = totalEggs / eggCartonSize;
                System.out.println("총 " + totalEggCartons + "개의 계란판이 필요합니다.");
            }
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다.");
        }

        //내가 적은 답 (계란이 1개라도 계란판이 필요하다고 생각하고 적었는데 아니었네 따흐흑)
//        int egg;
//        int result;
//
//        System.out.println("닭이 낳은 달걀의 수는 총 몇 개입니까?");
//
//        try {
//            egg = scanner.nextInt();
//        } catch (Exception e) {
//            egg = -1;
//        }
//
//        if (egg > 0) {
//            if (egg % 30 == 0) {
//                result = egg / 30;
//            } else {
//                result = (egg / 30) + 1;
//            }
//            System.out.println("총 " + result + "개의 계란판이 필요합니다.");
//        } else {
//            System.out.println("계란판이 필요하지 않습니다.");
//        }
    }
}
