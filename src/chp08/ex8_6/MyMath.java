package chp08.ex8_6;

public class MyMath {
// 공유영역 할당 메소드: 클래스메소드
    static int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }
    static int min(int n1, int n2) {
        return n1 < n2 ? n1 : n2;
    }
}
