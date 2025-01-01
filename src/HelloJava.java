package src;

public class HelloJava {
    public static void main(String[] args) {
        System.out.println("hello java");
    }
}

/*
[컴파일과 살행]
컴파일러(javac)가 .java를 .class로 즉, 자바 소스 코드를 바이트코드로 변환
JVM(가상머신)이 실행되어 프로그램을 작동함

인텔리제이를 통해서 자바를 설치할 수 있다.

실행하려면 javac로 컴파일해야하는데 인텔리제이에서 이를 자동으로 해줌
-> out이라는 파일에 javac를 통해 컴파일된 파일을 확인할 수 있음.


Hello.java를 Hello.class로 컴파일 한 다음 이 파일을 실행시키기 위해서는
java Hello
명령어로 실행해야함.
인텔리제이에서는 컴파일과 실행을 같이 해줌. (== 편리하게 사용 가능)

javac는 컴파일 단계에서 최적화를 진행함 => 사용하지 않는 변수는 그냥 없애버림
 */