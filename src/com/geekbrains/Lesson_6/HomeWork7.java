package com.geekbrains.Lesson_6;

public class HomeWork7 {
    public static void main(String[] args) {

        Animal[] participants = prepareParticipants();
        for (Animal participant : participants) {
            participant.run();
            participant.swim();
        }
        System.out.println();
        System.out.println("Количество созданных животных: " + Animal.getCount() + ", из которых:");
        System.out.println("Котов: " + Cat.getCount());
        System.out.println("Собак: " + Dog.getCount());
    }

    private static Animal[] prepareParticipants() {
        return new Animal[] {
                new Dog(400, 30),
                new Dog(100, 5),
                new Dog(600, 10),
                new Cat(100, 2),
                new Cat(300, 10),
                new Cat(200, 10),
        };
    }
}
