package Lab4;

import java.util.Arrays;
import java.util.Scanner;

import static Lab4.Tasks.*;

public class Main {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();

        printThreeWords();
        System.out.println();

        checkSumSign();
        System.out.println();

        printColor();
        System.out.println();

        compareNumbers();
        System.out.println();

        checkSum(2,8);

        checkNumber(5);
        checkNumber(-5);
        checkNumber(0);
        System.out.println();

        System.out.println(isNegative(-5));
        System.out.println(isNegative(5));
        System.out.println();

        printStringNTimes("Привет, мир!", 3);
        System.out.println();

        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1900));
        System.out.println();

        invertArray();

        fillArray();

        doubleLessThan6();

        fillDiagonal();

        int[] newArray = initArray(10, 5);
        for (int num : newArray) {
            System.out.print(num);
        }
    }
}

