package Lab6.Task3;

public class Main {
    public static void main(String[] args) {
        Park park = new Park();

        Park.Attraction attraction1 = park.new Attraction("Колесо обозрения", "10:00 - 22:00", 500);
        Park.Attraction attraction2 = park.new Attraction("Горки", "10:00 - 20:00", 300);

        attraction1.info();
        attraction2.info();
    }
}
