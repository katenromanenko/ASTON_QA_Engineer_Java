package Lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        isSumInRange();
        checkNumber(5);
        checkNumber(-5);
        checkNumber(0);
        System.out.println(isNegative(-5));
        System.out.println(isNegative(5));
        printStringNTimes("Привет, мир!", 3);
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1900));
        invertArray();
        fillArray();
        doubleLessThan6();
        fillDiagonal();
        System.out.println(java.util.Arrays.toString(initArray(5, 2)));
    }
    //1.Создайте метод printThreeWords()
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //2. Создайте метод checkSumSign()
    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    //3. Создайте метод printColor()
    public static void printColor() {
        int value = 50;

        if (value < 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }
        //4. Создайте метод compareNumbers(),
        // в теле которого объявите две int переменные a и b
    public static void compareNumbers() {
        int a = 10;
        int b = 20;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    //5. Напишите метод, проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно)
    public static void isSumInRange() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = scanner.nextInt();

        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    //6. Напишите метод,
    //должен напечатать, положительное или отрицательное.
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    //7. Напишите метод,
    // должен вернуть true, если число отрицательное,
    // и вернуть false если положительное.
    public static boolean isNegative(int number) {
        return number < 0;
    }
    //8. Напишите метод,
    //должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void printStringNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
    //9.Напишите метод, который определяет, является ли год високосным
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
    //10. Задать целочисленный массив
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
    //11. Задать пустой целочисленный массив длиной 100.
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
    //12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void doubleLessThan6() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
    //13. Создать квадратный двумерный целочисленный массив
    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
        for (int[] row : arr) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
    //14. Написать метод, принимающий на вход два аргумента: len и initialValue
    public static int[] initArray(int len, int initialValue) {
        int[] arr = new int[len];
        java.util.Arrays.fill(arr, initialValue);
        return arr;
    }

}

