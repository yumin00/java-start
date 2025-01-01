package src.array;

public class Array {
    public static void main(String[] args) {
        int[] students;
        students = new int[5]; // length가 5인 배열

        System.out.println(students); //[I@7b23ec81 [I == int[] 라는 의미, 7b23ec81 는 참조값

        for (int i = 0; i < 5; i ++) {
            students[i] = 10 + 2*i;
        }

        System.out.println(students[4]); // 10 + 2* 4 = 18
        System.out.println(students.length); //5


        int[] newStudents;
        newStudents = new int[]{10, 20, 30, 40, 50};
        System.out.println(newStudents[2]); //30


        int[] newNewStudents = {10, 20, 30, 40, 50, 10, 20, 30};
        System.out.println(newNewStudents[3]);
    }
}
