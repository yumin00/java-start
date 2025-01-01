package src.array;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < 5; i ++) {
            System.out.println(numbers[i]);
        }

        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
