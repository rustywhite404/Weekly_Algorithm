import java.util.Scanner;

public class A007 {
    public static void main(String[] args) {
        //국어 90점, 영어 75점 수학 30점, 과학 40점 이라는 표를 기준으로
        //과목과 점수를 배열로 선언하고 과목명을 입력받아
        //해당 과목의 점수를 출력해주는 프로그램

        //책 정답
        String[] subjects = {"국어", "영어", "수학", "과학"};
        int[] scores = {90, 75, 30, 40};

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 알고싶은 과목명을 입력하세요.");

        String inputSubject = scanner.nextLine();

        for (int i = 0; i < subjects.length; i++) {
            String subject = subjects[i];

            if (inputSubject.equals(subject)) {
                System.out.println(
                        inputSubject + "점수는 " + scores[i] + "점 입니다."
                );
            }
        }

        //내가 생각한 방법 (2차원 배열로 해야한다고 너무 어렵게 생각했다...)
//        String[][] score = {
//                {"국어", "영어", "수학", "과학"},
//                {"90", "75", "30", "40"},
//        };
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("과목을 입력하세요.");
//
//        try {
//            String input = scanner.nextLine();
//
//            switch (input) {
//                case "국어" :
//                    System.out.println("90점 입니다.");
//                    break;
//                case "영어" :
//                    System.out.println("75점 입니다.");
//                    break;
//                case "수학" :
//                    System.out.println("30점 입니다.");
//                    break;
//                case "과학" :
//                    System.out.println("40점 입니다.");
//                    break;
//                default:
//                    System.out.println("잘못된 입력입니다.");
//            }
//
//        } catch (Exception e) {
//            System.out.println("잘못된 입력입니다.");
//        }

    }
}
