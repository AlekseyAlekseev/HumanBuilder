package ru.netology;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAddress("Сидней")
                .setAge(35)
                .build();

        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .setAge(10)
                .build();

        System.out.println("У женщины - " + mom + ". Есть сын - " + son);


        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}