package Lab7_Task1;

public class Cat extends Animal{
    private final String name;
    private final int appetite;
    private boolean hungry;
    static int countCat = 0;

    Cat (String name, int appetite){
        super();
        countCat++;
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    @Override
    void run(int range) {
        if (range > 200) {
            System.out.println(name+ " не может бежать больше 200 м.");
        } else {
            System.out.println(name + " пробежал " + range + " м.");
        }
    }
    @Override
    void swim(int range) {
        System.out.println("Кот не умеет плавать.");
    }

    static int getCountCat(){
        return countCat;
    }

    void info() {
        String isHungry = !hungry ? "сыт" : "голоден";
        System.out.println(name + ": " + isHungry);
    }

    void eat(Plate plate) {
        if (hungry && plate.decreaseFood(appetite))
            hungry = false;
    }

}
