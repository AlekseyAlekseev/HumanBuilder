package ru.netology;

public class PersonBuilder {

    private String name;
    private String surname;
    private int age = 0;
    private String address = "";

    public PersonBuilder() {

    }

    public PersonBuilder setName(String name) {
        PersonBuilder.this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        PersonBuilder.this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        PersonBuilder.this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        PersonBuilder.this.address = address;
        return this;
    }

    public Person build() {
        return new Person(name, surname, age, address);
    }
}
