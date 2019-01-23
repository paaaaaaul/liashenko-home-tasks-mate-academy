package Lesson1.RestoreArray;

import java.util.Scanner;

public class TheRealRestore {

    public static String restoreTheArray() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] monotoneArray = new int[size];

        int cur;
        int prev;
        int next;

        for (int i = 0; i < size; i++) {
            monotoneArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < monotoneArray.length; i++) {
            System.out.print(monotoneArray[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < monotoneArray.length; i++) {
            cur = monotoneArray[i];

            // проверяем, отрицательное ли число
            // и проверяем последовательность на возрастание
            if (cur < 0) {
                prev = monotoneArray[i - 1];
                next = prev - monotoneArray[i - 1];

                // если число в массиве равно этому же числу (если отнять 2),
                // тогда последовательность возрастающая
                if (prev == next + 2) {
                    cur = prev + 1; //возрастающая, к предыдущему числу (относиьтельно отрицатеьному) добавляем 1

                    monotoneArray[i] = cur;

                    System.out.print(" ");
                } else {
                    // если наоборот, то убывающая
                    cur = prev - 1; // и отнимаем 1
                    monotoneArray[i] = cur;
                    System.out.print(" ");
                }
            }
            System.out.print(monotoneArray[i] + " ");
        }
        System.out.println("\n Restoring is finished");
        return "finished";
    }

}
