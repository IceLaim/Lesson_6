package com.geekbrains.Lesson_6;

public class Cat extends Animal {

    private static int count;

    public Cat(int maxRunDistance, int maxSwimDistance) {
        super(maxRunDistance, maxSwimDistance);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public boolean run() {
        if (maxRunDistance <= 200) {
            System.out.println("Кот пробежал " + maxRunDistance + " метров");
            return true;
        }
        System.out.println("Кот не может пробежать более 200 метров");
        return false;
    }

    @Override
    public boolean swim() {
        System.out.println("Кот не умеет плавать");
        return false;
    }
}
