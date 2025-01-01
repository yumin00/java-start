package src.method;

public class Method {
    public static void main(String[] args) {
        start();
        int a = 5;
        int b = 6;

        int result = add(a, b);


        double c = 1.5;
//        int result2 = add(c, b); 컴파일 오류 발
        int result2 = add((int) c, b); // 명시적 형변환을 해줘야함.

        double result3 = add(c, b); // int인 b는 자동 형변환이 됨. int < long < double

    }

    // 메서드 선언
    // 반환 타입, 메서드 이름, 매개변수(파라미터)
    // public: 다른 클래스에서 호출할 수 있는 메서드라는 뜻
    // static: 객체를 생성하지 않고 호출할 수 있는 정적 메서드라는 뜻
    // public, static과 같은 부분을 제어자(Modifier)이라고 한다.
    public static int add(int a, int b) {
        return a + b;
    }

    // 매개변수와 반환 타입이 없는 경우
    // void: 반환 타입이 없는 경우 사용한다.
    // void를 사용하면 return하지 않아도 자동으로 return을 해준다.
    public static void start() {
        System.out.print("프로그램을 시작합니다.");
    }

    // 오버로딩
    // 이름이 같은 메서드를 만들 수 있다.
    // 이름은 같지만 매개변수 타입/순서가 다르다면 오버로딩 가능 (반환 타입만 다른 경우는 오버로딩 불가능)
    public static double add(double a, double b) {
        return a + b;
    }
    // 메서드 시그니처: 메서드를 구분할 수 있는 고유한 식별자 -> 메서드 이름, 매개변수 타입/순서


    // ** 자바는 항상 변수의 값을 복사해서 사용한다.
}
