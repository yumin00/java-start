package src.scope;

public class Cast {
    public static void main(String[] args) {
        int a = 1;
        double b = 1.5;

        a = (int) b; // 명시적 형변환
        System.out.println(a);
    }
}
