package ua.hillel.lessons.lesson9.oop.polymorfizm.overload;

public class Cow extends Animal {
    @Override
    public void sound() {
        System.out.println("Myyy");
    }

    public void aboutCow() {
        sayAnimalName("Burenka");
        sound();
    }
}
