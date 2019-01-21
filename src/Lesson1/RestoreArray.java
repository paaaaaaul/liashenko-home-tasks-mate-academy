/*
* Given an unsorted array of positive integers.
 * The array divided into monotone parts in which some elements replaced by negative values.
 * Find missing positive integers in the array. Negative elements can be placed only inside a monotone part.
Negative elements cannot be in neighboring cells.

* monotone part - a sequence where each next number greater(less) than previous.
 * e.g. 4 5 6 7 8 is the monotone part, but 5 3 1 6 7 is not monotone.

Input

{array_length}
{array_values}

Output

{restored array}

Example
Input
8
1 2 -1 4 7 6 -2 4

Output
1 2 3 4 7 6 5 4

* */

package Lesson1;

import java.util.Scanner;

public class RestoreArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();


        int[] monotoneArray = new int[size];

        int cur;
        int prev;
        int next;

        for (int i = 0; i < size; i++) { // в цикле заполняем массив
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


                    if (prev == next + 2) {
                        cur = prev + 1;

                        monotoneArray[i] = cur;

                        System.out.print(" ");
                    } else {

                        cur = prev - 1;
                        monotoneArray[i] = cur;
                        System.out.print(" ");
                    }
                }



            System.out.print(monotoneArray[i] + " ");



        }
    }
}



