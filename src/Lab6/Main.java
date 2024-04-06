package Lab6;

public class Main {
    public static void main(String[] args) {
        Park park = new Park();

        Person[] persArray = new Person[5];

        Park.Attraction attraction1 = park.new Attraction("Колесо обозрения", "10:00 - 22:00", 500);
        Park.Attraction attraction2 = park.new Attraction("Горки", "10:00 - 20:00", 300);

        persArray[0] = new Person("Ivanov Ivan", "Аттракционщик",
                "ivivan@mailbox.com", 892312312, 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Управляющий парком",
                "ppetrov@mailbox.com", 892312313, 40000, 35);
        persArray[2] = new Person("Sidorov Sergei", "Разработчик игр",
                "ssidorov@mailbox.com", 892312314, 50000, 40);
        persArray[3] = new Person("Smirnov Alex", "Дизайнер аттракционов",
                "asmirnov@mailbox.com", 892312315, 35000, 28);
        persArray[4] = new Person("Kuznetsov Nikolay", "Тестировщик аттракционов",
                "nkuznetsov@mailbox.com", 892312316, 32000, 32);

        attraction1.info();
        attraction2.info();

        for (Person person : persArray) {
            person.info();
        }
    }
}
