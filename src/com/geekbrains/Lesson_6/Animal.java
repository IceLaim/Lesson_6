package com.geekbrains.Lesson_6;

public abstract class Animal {

    private static int count;

    protected int maxRunDistance;
    protected int maxSwimDistance;

    public Animal(int maxRunDistance, int maxSmimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSmimDistance;
        count++;
    }

    public abstract boolean run();
    public abstract boolean swim();

    public static int getCount() {
        return count;
    }
}
