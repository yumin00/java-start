package src.array;

public class ArrayDi0 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3]; //행은 2, 열은 3

        for (int row = 0; row < 2; row ++) {
            for (int column = 0; column < 3; column ++) {
                arr[row][column] = 1;
            }
        }

        int[][] newArr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int row = 0; row < newArr.length; row ++) {
            for (int col = 0; col < newArr[row].length; col ++) {
                System.out.print(newArr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
