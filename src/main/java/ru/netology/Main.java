package ru.netology;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAddress("Сидней")
                .setAge(35)
                .build();
        Person son = new PersonBuilder()
                .setName("Антошка")
                .build();

        System.out.println("У женщины - " + mom + ". Есть сын - " + son);


        Person son2 = new PersonBuilder()
                .setName("Ваня")
                .setAge(10)
                .build();

        System.out.println(son2);

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