package ru.netology;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAddress("Сидней")
                .setAge(31)
                .build();
        Person son = new PersonBuilder()
                .setName("Антошка")
                .build();

        System.out.println("У женщины - " + mom + ". Есть сын - " + son);


        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Недопустимый возраст для человека");
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}