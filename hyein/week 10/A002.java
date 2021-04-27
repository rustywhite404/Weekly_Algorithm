public class A002 {
    //주사위 굴리는 메서드 만들기
    int face = (int)(Math.random()*6)+1;

    void roll(){
        System.out.println("주사위를 굴려라~~~");
        System.out.println("주사위 값: " + face);
    }

    public static void main(String[] args) {
        A002 a = new A002();
        a.roll();
    }
}
