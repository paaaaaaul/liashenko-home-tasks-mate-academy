
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

package Lesson1.Ranges;


public class Ranges {

    public static void main(String[] args) {
        RangeDefiner.defineTheRange();
        //

    }
}
