package Lab7_Task1;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animalGiraffe = new Animal();
        Animal animalElephant = new Animal();
        Animal animaLion = new Animal();

        Cat catBarsik = new Cat("Барсик", 50);
        Dog dogTuzik = new Dog("Тузик");
        Cat catDima = new Cat("Дима", 50);
        Dog dogGuf = new Dog("Гуф");
        catBarsik.run(100);
        dogTuzik.run(250);

        catDima.swim(1);
        dogGuf.swim(5);

        System.out.println("Всего животных: " + Animal.getCountAnimal());
        System.out.println("Всего котов: "+ Cat.getCountCat());
        System.out.println("Всего собак: "+ Dog.getCountDod());

        Cat[] cats = {new Cat("Василий", 50), new Cat("Матроскин", 50), new Cat("Пятнышко", 25), new Cat("Максфлянтий", 5), new Cat("Граф", 1)};
        Plate plate = new Plate(80);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}
