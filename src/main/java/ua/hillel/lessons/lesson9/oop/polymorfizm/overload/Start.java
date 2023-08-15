package ua.hillel.lessons.lesson9.oop.polymorfizm.overload;

public class Start {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        System.out.println("-------------");
        Cat cat = new Cat();
        cat.aboutCat();
        System.out.println("-------------");
        Dog dog = new Dog();
        dog.aboutDog();
        System.out.println("-------------");
        Cow cow = new Cow();
        cow.aboutCow();
    }
}
