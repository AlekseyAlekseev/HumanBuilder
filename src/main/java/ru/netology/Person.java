package ru.netology;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int age = 0;
    private String address = "";

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        return this.age != 0;
    }

    public boolean hasAddress() {
        return !this.address.equals("");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String setAddress(String address) {
        this.address = address;
        return address;
    }

//    public PersonBuilder newChildBuilder() {
//         = name;
//        return this;
//    }
//
//    public void happyBirthday(int age) {
//        if ()
//    }

    @Override
    public String toString() {
        return "У человека - имя: " + name + ", фамилия: " + surname + ", возраст: " + age + ", город проживания: " + address;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}
