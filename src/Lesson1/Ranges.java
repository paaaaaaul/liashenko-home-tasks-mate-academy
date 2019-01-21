
/*
* Given a sorted integer array.
* Print all ranges in which each next element is increased by one.
* The range is defined its minimal and maximal values.
* If the range contains one element print only its value.

Input
{array_length}
{array_values}

Output
[{min_range1} {max_range1}]...[{min_rangeN} {max_rangeN}]

Example
Input
11
1 2 3 5 8 9 10 13 14 15 16

Output
[1 3][5][8 10][13 16]


*
* */

package Lesson1;

import java.util.Scanner;

public class Ranges {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // определяем размер массива (при вводе)
        int N = in.nextInt();

        StringBuilder builder = new StringBuilder();

        // каждый вводимый (в данном случае первый) элемент массива
        int prev = in.nextInt();

        int cur = 0;
        int count = 1;
        // сразу в начале добавляем открывающую скобку
        builder.append('[').append(prev);

        for (int i = 1; i < N; i++) {
            cur = in.nextInt();

            // проверяем, сохраняется ли
            // последовательность чисел
            if (prev + 1 == cur) {
                count++;
            } else if (count == 1) {
                builder.append("][").append(cur);
            } else {
                // если последовательность завершена,
                // добавялем пробел, добавляем прев,
                // закрываем и сразу открываем скобки, добавляем карент
                builder.append(' ').append(prev).append("][").append(cur);
            }
            prev = cur; // записываем прев и ждем следующую итерацию
        }
        if (count != 1) {
            builder.append(" ").append(prev);
        }
        builder.append("]");
        System.out.println(builder.toString());
    }



}
