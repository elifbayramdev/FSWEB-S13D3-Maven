package org.example;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    private String email;
    private String phone;
    private String city;

    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName, age, "bilinmiyor", "bilinmiyor", "bilinmiyor");
    }

    public Person(String firstName, String lastName, int age, String email, String phone, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}