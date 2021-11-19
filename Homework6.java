/**
 * Java 1 homework 6
 *
 * @author Kirill Morozov
 * version 19.11.2021
 */


class Homework6 {

    public static void main(String[] args) {
        Cat cat = new Cat("Ash", 300, 0);

        Dog dog = new Dog("Pirat", 200, 5);

        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            animal.swim();
            animal.run();
            System.out.println();
        }
    }
}

interface IAnimal {
    void swim();
    void run();
}

abstract class Animal implements IAnimal {
    protected String name;
    protected int run;
    protected int swim;

    Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    @Override
    public String toString() {
        return name + " ," + run + " ," + swim;
    }
}

class Cat extends Animal {
    static int runMax = 200;
    static int swimMax = 0;

    Cat(String name, int run, int swim) {
        super(name, run, swim);
    }

    public void swim() {
        System.out.println(name + " can't swim");
    }

    public void run() {
        if (run < runMax && run >= 0) {
            System.out.println(name + " running " + run + " m");
        } else {
            System.out.println(name + " can't running " + run + " the distance has " + runMax + " meters");
        }
    }
}

class Dog extends Animal {
    static int runMax = 500;
    static int swimMax = 10;

    Dog(String name, int run, int swim) {
        super(name, run, swim);
    }

    public void swim() {
        if (swim < swimMax && swim >= 0) {
            System.out.println(name + " swims " + swim + " m");
        } else {
            System.out.println(name + " can't sims " + swim + " the distance has  " + swimMax + " meters");
        }
    }

    public void run() {
        if (run < runMax && run >= 0) {
            System.out.println(name + " running " + run + " m");
        } else {
            System.out.println(name + " can't running " + run + " the distance has " + runMax + " meters");
        }
    }
}
