/**
 * Java 1 homework 6
 *
 * @author Kirill Morozov
 * version 19.11.2021
 */



class Homework6 {

    public static void main(String[] args) {
	   Dog dog = new Dog("Ash",500, 10);
       Cat cat = new Cat("Murszik",200,0);

       IAnimal[] animals = {dog, cat};
       for(IAnimal animal : animals) {
           System.out.println(animal);
           System.out.println(animal.run());
       }
       for (IAnimal animal : animals) {
           System.out.println(animal);
           System.out.println(animal.swims());
       }
    }
}

interface IAnimal{
    String run();
    String swims();

}

abstract class Animal implements IAnimal {
    protected String name;
    protected int run;
    protected int swims;

    Animal(String name, int run, int swims) {
        this.name = name;
        this.run = run;
        this.swims = swims;

    }

    @Override
    public  String toString() {
        return  "run:" + run;
    }

    @Override
    public String swims() {
        return "swims: " + swims;
    }


}

class Dog extends Animal {
    Dog(String name, int run, int swims) {
        super(name, run, swims);
    }

    @Override
    public String run() {
        return "run: " + run;
    }
}

class Cat extends Animal {
    Cat(String name, int run, int swims) {
        super(name ,run, swims);
    }

    @Override
    public String run() {
        return "run: " + run;
    }

    public String Swims() {
        return "swims: " + swims;
    }

}
