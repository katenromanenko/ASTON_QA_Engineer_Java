package Lab6;
public class Person {
    private String name;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

public Person(String name, String position, String email, int phone, int salary, int age) {
    this.name = name;
    this.position = position;
    this.email = email;
    this.phoneNumber = phone;
    this.salary = salary;
    this.age = age;
}
public void info() {
    System.out.println("ФИО: " + name +
            "; должность: " + position +
            "; email: " + email +
            "; телефон: " + phoneNumber +
            "; зарплата: " + salary +
            "; возраст: " + age);
}
    }