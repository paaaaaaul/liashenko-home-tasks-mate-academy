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

package Lesson1.RestoreArray;


public class RestoreArray {

    public static void main(String[] args) {
       TheRealRestore.restoreTheArray();
    }
}