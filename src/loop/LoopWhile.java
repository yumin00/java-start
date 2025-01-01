package src.loop;

public class LoopWhile {
    public static void main(String[] args) {
        int count = 1;

        while (count < 4) {
            count += 1;
            System.out.println("현재 숫자는: " + count);
        }

        int sum = 0;
        int i = 0;
        int endNum = 5;

        while (i <= endNum) {
            sum = sum + i;
            i++;
            System.out.println("현재 합계는 " + sum);
        }

        int newSum = 0;
        int newI =  0;
        do {
            newSum = newSum + newI;
            newI ++;
            System.out.println("현재 새로운 합계는 " + newSum);
        } while (newI < 4);
    }
}
