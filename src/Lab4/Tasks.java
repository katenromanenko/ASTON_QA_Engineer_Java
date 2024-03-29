package Lab4;
public class Tasks {
    //#1
    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }
    //#2
    public static void checkSumSign() {
        int a = 5;
        int b = -7;
        int sum = a + b;
        System.out.println(sum >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }
    //#3
    public static void printColor() {
        int value = 50;
        String color = value <= 0 ? "Красный" : (value <= 100 ? "Желтый" : "Зеленый");
        System.out.println(color);
    }
    //#4
    public static void compareNumbers() {
        int a = 10;
        int b = 20;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
    //#5
    public static boolean checkSum(int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
    }
    //#6
    public static void checkNumber(int number) {
        System.out.println(number >= 0 ? "Число положительное" : "Число отрицательное");
    }
    //#7
    public static boolean isNegative(int number) {
        return number < 0;
    }
    //#8
    public static void printStringNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
    //#9
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    //#10
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
    //#11
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
    //#12
    public static void doubleLessThan6() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
    //#13
    public static void fillDiagonal() {
        int size = 5;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //#14
    public static int[] initArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;

    }
}
