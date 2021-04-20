import java.io.*;
import java.util.Scanner;

public class A002 {
    public static void main(String[] args) {
        //텍스트 파일명을 입력받아 그 파일을 복사하는 프로그램을 만들어보자.

        //책 정답 - 이것도 동일 파일이 존재할 경우에 대한 처리가 없네...
        Scanner scanner = new Scanner(System.in);

        System.out.println("복사할 파일명을 입력하세요.");
        String sourceFileName = scanner.nextLine();

        System.out.println("저장할 파일명을 입력하세요.");
        String destinationFileName= scanner.nextLine();

        FileInputStream inputStream = null;
        FileWriter writer = null;

        try {
            inputStream = new FileInputStream("src/part09/" + sourceFileName);
        } catch (FileNotFoundException e) {
            System.out.println("존재하지 않는 파일입니다. " + sourceFileName);
            System.exit(10);
        }

        try {
            writer = new FileWriter("src/part09/" + destinationFileName);
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다." + destinationFileName);
            System.exit(11);
        }

        Scanner fileReader = new Scanner(inputStream);

        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();

            try {
                writer.write(line);
                writer.write("\n");
            } catch (IOException e) {
                System.out.println("파일 쓰기에 실패했습니다." + destinationFileName);
                System.exit(12);
            }
        }

        System.out.println("파일이 복사되었습니다.");
        System.out.println("원본 파일: " + sourceFileName);
        System.out.println("복제 파일: " + destinationFileName);

        try {
            writer.close();
        } catch (IOException e) {
            System.out.println("파일 닫는 중 오류가 발생했습니다.");
        }

        //내 생각에는...
        //1. 파일명을 입력받고
        //2. 파일을 읽어오고
        //3. 파일을 생성하면서
        //4. 읽어온 내용으로 새 파일에 집어넣자
        //만약에 복사본 파일과 동일한 이름이 이미 존재한다면? << 이 부분 처리를 잘 모르겠다ㅠㅠ
//        Scanner scanner = new Scanner(System.in);
//        FileInputStream inputStream = null;
//        FileWriter writer = null;
//
//        System.out.println("복사할 파일명을 입력해주세요.");
//        String fileName = scanner.nextLine();
//
//        try {
//            inputStream = new FileInputStream("src/part09/" + fileName);
//        } catch (FileNotFoundException e) {
//            System.out.println("파일을 찾을 수 없습니다.");
//            System.exit(10);
//        }
//        //파일 읽고 생성하기
//        Scanner scanner1 = new Scanner(inputStream);
//
//        try {
//            while (scanner1.hasNextLine()) {
//                String fileText = scanner1.nextLine(); //파일 내용 한줄씩
//
//                //복사본 파일 생성하기
//                writer = new FileWriter("src/part09/" + fileName + "(copy)", true);
//                writer.write(fileText);
//                writer.write("\n");
//                writer.close();
//
//            }
//            System.out.println("파일 복사가 완료되었습니다.");
//
//        } catch (IOException e) {
//            System.out.println("파일을 생성할 수 없습니다.");
//            System.exit(11);
//        }
    }
}
