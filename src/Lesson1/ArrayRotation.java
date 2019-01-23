/*
* Given an integer array. Move first k elements to the array end.

Input

{array length} {k}
{array values}

Output
{rotated array}

Example
Input

5 2
5 6 1 2 6

Output

1 2 6 5 6
*
* */

package Lesson1;
import java.util.Scanner;

public class ArrayRotation {

    public static void moveToEnd(int arr[], int n, int k) {
        for (int i = 0; i < k; i++) {           // к примеру, к = 2, и массиве {1, 2, 3, 4, 5, 6}
            int x = arr[0];                     // в этот массив запишем
            for (int j = 0; j < n - 1; ++j) {   // j - индекс массива, по которому итерируемся
                arr[j] = arr[j + 1];             // n - индекс, к которому перемещаем элемент
            }
            arr[n - 1] = x;                     // на каждом проходе
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner kScanner = new Scanner(System.in);

        int size = scanner.nextInt(); // задаем размер массива
        int elToMove = kScanner.nextInt(); // задаем кол-во элементов, которые нуэно переместить
        int arr[] = new int[size]; // массив, кладем size, как размер массива
        int n = arr.length; // длина массива

        for (int i = 0; i < size; i++) { // в цикле заполняем массив
            arr[i] = scanner.nextInt();
        }
        moveToEnd(arr, size, elToMove); //передаем параметры в метод, который будет переносить элементы массива

        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " "); //выводим результат в консоль
        }
    }
}