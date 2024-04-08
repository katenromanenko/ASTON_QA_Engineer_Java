package Lab7_Task2;

public interface Shape {
    double calculatePerimeter();
    double calculateArea();
    String getColor();
    String getBorderColor();

    default void printCharacteristics() {
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет фона: " + getColor());
        System.out.println("Цвет границы: " + getBorderColor());
    }
}
