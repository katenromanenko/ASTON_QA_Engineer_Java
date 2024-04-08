package Lab7_Task2;

public class SnapeMain {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5.0, "Красный", "Черный"),
                new Rectangle(4.0, 5.0, "Синий", "Белый"),
                new Triangle(3.0, 4.0, 5.0, "Зеленый", "Желтый")
        };

        for (Shape shape : shapes) {
            System.out.println("Характеристики " + shape.getClass().getSimpleName() + ":");
            shape.printCharacteristics();
            System.out.println();
        }
    }
}

