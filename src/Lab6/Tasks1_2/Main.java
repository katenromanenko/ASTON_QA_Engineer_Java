package Lab6.Tasks1_2;

public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];

        persArray[0] = new Person("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", 892312312, 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Manager",
                "ppetrov@mailbox.com", 892312313, 40000, 35);
        persArray[2] = new Person("Sidorov Sergei", "Developer",
                "ssidorov@mailbox.com", 892312314, 50000, 40);
        persArray[3] = new Person("Smirnov Alex", "Designer",
                "asmirnov@mailbox.com", 892312315, 35000, 28);
        persArray[4] = new Person("Kuznetsov Nikolay", "Tester",
                "nkuznetsov@mailbox.com", 892312316, 32000, 32);
        for (Person person : persArray) {
            person.info();
        }
    }
}