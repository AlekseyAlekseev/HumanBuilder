package ru.netology;


import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String address;
    PersonBuilder personBuilder = new PersonBuilder();

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
        if (!hasAddress()) {
            personBuilder.setAddress(address);
        } else {
            System.out.println("Город уже указан");
        }
        return address;
    }

    //
//    public PersonBuilder newChildBuilder() {
//
//    }
//
    public void happyBirthday(Person person) {
        if (!hasAge()) {
            System.out.println("Возраст не известен");
        } else {
            age = person.getAge() + 1;
            personBuilder.setAge(age);
        }
    }

    @Override
    public String toString() {
        return "имя: " + name + ", фамилия: " + surname + ", возраст: " + age + ", город проживания: " + address;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}