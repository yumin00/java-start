package src.scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hi = scanner.nextLine(); // 입력을 스트링 / 엔터를 입력할 때까지 문자를 가져온다.
        System.out.println(hi);


        int intVal = scanner.nextInt(); // 입력을 int
        System.out.println(intVal);

        double doubleVal = scanner.nextDouble(); // 입력을 double
        System.out.println(doubleVal);
    }
}
