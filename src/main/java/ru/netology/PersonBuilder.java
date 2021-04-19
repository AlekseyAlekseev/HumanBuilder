package ru.netology;

public class PersonBuilder {

    private String name;
    private String surname;
    private int age = 0;
    private String address = "";


    public PersonBuilder() {

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

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if ( age < 0) {
            throw new IllegalArgumentException("Указан недопустимый возраст");
        } else if (name == null || surname == null) {
            throw new IllegalStateException("Не заполнены обязательные поля");
        }
        return new Person(name, surname, age, address);
    }
}
