package part09;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput06 {
    public static void main(String[] args) {
        //여러 줄의 문자열을 입력받아 저장할 수 있는 프로그램
        //계속해서 문자열을 입력받고 입력받은 문자열이 비어 있으면 프로그램을 종료한다.

        //책에 적힌 답 - 계속 입력이 가능한 방식
        Scanner scanner = new Scanner(System.in);
        FileWriter writer = null;

        try {
            writer = new FileWriter("hyein/week 2/test.txt");
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다.");
            System.exit(11);
        }

        System.out.println("저장할 문자열을 입력하세요.(종료: 입력 없이 엔터)");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            try {
                writer.write(input);
                writer.write("\n");
            } catch (IOException e) {
                System.out.println("파일에 문자열을 쓰지 못했습니다.");
                System.exit(12);
            }
        }

        try {
            writer.close();
        } catch (IOException e) {
            System.out.println("파일을 닫는데 실패했습니다.");
            System.exit(13);
        }


        //내가 적은 답 - 문자열 하나하나 추가로 물어보고 입력받는 방식이라서 비효율적이네...
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("저장할 문자열을 입력하세요. 미입력시 종료됩니다.");
//
//        try {
//            FileWriter writer = new FileWriter("hyein/week 2/test.txt");
//            String input = scanner.nextLine();
//            if (input.isEmpty()) {
//                System.out.println("입력을 종료합니다.");
//                writer.close();
//            } else {
//                while (!input.isEmpty()) {
//                    writer.write(input + "\n");
//                    System.out.println("추가할 문자열을 입력하세요.");
//                    input = scanner.nextLine();
//                    if (input.isEmpty()) {
//                        System.out.println("입력을 종료합니다.");
//                        writer.close();
//                        break;
//                    }
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("파일 생성에 실패했습니다.");
//            System.exit(11);
//        }
    }
}
