package com.geekbrains.Lesson_6;

public class Dog extends Animal {
    private static int count;

    public Dog(int maxRunDistance, int maxSwimDistance) {
        super(maxRunDistance, maxSwimDistance);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public boolean run() {
        if (maxRunDistance <= 500) {
            System.out.println("Собака пробежала " + maxRunDistance + " метров");
            return true;
        }
        System.out.println("Собака не может пробежать более 500 метров");
        return false;
    }

    @Override
    public boolean swim() {
        if (maxSwimDistance <= 10) {
            System.out.println("Собака проплыла " + maxSwimDistance + " метров");
            return true;
        }
        System.out.println("Собака не может проплыть более 10 метров");
        return false;
    }
}
