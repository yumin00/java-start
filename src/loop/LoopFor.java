package src.loop;

public class LoopFor {
    public static void main(String[] args) {
        /* for (1. 초기식; 2. 조건식; 4. 증감식) {
               3. 코드
           }
         */

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }


        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= 3; j ++) {
                System.out.println(i + j);
            }
        }
    }
}
