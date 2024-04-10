package Lab8;

public class Main {
    public static void main(String[] args) {
        ArrayProcessor processor = new ArrayProcessor();
        String[][] array = new String[4][4];
        try {
            processor.processArray(array);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }
}
