package OOP;

import java.io.PrintStream;

public class Cat {
    String name;
    int age;
    int weight;
    int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
    void InfoCat() {
        ((PrintStream) null).println(" Имя: " + name + " Возраст: " + age + " Вес: " + weight + " Сила: " + strength);
    }
    public static void main(String[] args) {
        Cat cat = new Cat("acsv", 12, 123, 34);
        cat.InfoCat();
    }
}


