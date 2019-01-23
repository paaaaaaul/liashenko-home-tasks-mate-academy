package Lesson1.Ranges;

import java.util.Scanner;

public class RangeDefiner {

    public static String defineTheRange() {
        Scanner in = new Scanner(System.in);

        // определяем размер массива (при вводе)
        int inputSize = in.nextInt();

        StringBuilder builder = new StringBuilder();

        // каждый вводимый (в данном случае первый) элемент массива
        int prev = in.nextInt();

        int cur;
        int count = 1;
        // сразу в начале добавляем открывающую скобку
        builder.append('[').append(prev);

        for (int i = 1; i < inputSize; i++) {
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
        return builder.toString();
    }
}