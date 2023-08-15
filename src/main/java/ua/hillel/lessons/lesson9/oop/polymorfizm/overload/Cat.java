package ua.hillel.lessons.lesson9.oop.polymorfizm.overload;

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("May");
    }

    public void aboutCat() {
        sayAnimalName("Marysia");
        sound();
    }
}
