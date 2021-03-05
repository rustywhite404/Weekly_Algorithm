public class A006 {
    public static void main(String[] args) {
        //배열 {10, 20, 30, 40, 50}을 선언하고 이 배열에 담긴 모든 수를 더한 값을 출력하는 프로그램 만들기
        int[] arrays = {10, 20, 30, 40, 50};
        int sumArray = 0;

        //for문 경우
//        for (int i = 0; i < arrays.length; i++) {
//            sumArray = sumArray + arrays[i];
//        }

        //for-each문 경우 (더 짧게~)
        for (int array:arrays) {
            sumArray = sumArray + array;
        }

        System.out.println("다 더하면 " + sumArray + "입니다.");
    }
}
