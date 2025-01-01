package src.variable;

public class Var {
    public static void main(String[] args) {
        int a;
        a = 10;
        ++a;
        --a;

        System.out.println(a);

        int b = 5;

        int c = 3, d = 2;

        /*
            컴퓨터의 메모리는 여러 시스템이 함께 사용하는 공간이다.
            그래서 메모리에는 어떠한 값들이 계속 저장된다.
            변수를 선언하면 메모리상에 어떤 공간을 차지하는데, 이 공간에 이전에 사용했던 값이 들어있을 수 있다.
            따라서 변수를 선언하고 초기화하지 않으면 올바르지 않은 값을 가져올 수 있기 때문에 java에서는 변수를 초기화하지 않으면 컴파일 에러가 발생한다.
         */

        double aa = 10.5;
        boolean bb = false;
        char dd = 'A'; // 문자 하나
        String eee = "Hello"; // 문자열, 문자 길이에 따라 메모리 사용량이 동적으로 달라짐.


        byte bbb = 127;
        short sss = 32767;
        int iii = 21;// 21억 정도
        long lll = 222; // 그냥 겁나 길게..

        float fff = 10.0f; //2^32
        double dddd = 10.0; //2^64, 더블을 사용하는 것을 권장함.

        String aaaa = "aa";
        String bbbb = "bb";
        boolean result = aaaa.equals(bbbb);
        boolean result2 = "hello".equals("hello");

    }
}
