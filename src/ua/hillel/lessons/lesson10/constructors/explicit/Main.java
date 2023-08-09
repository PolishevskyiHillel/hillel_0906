package ua.hillel.lessons.lesson10.constructors.explicit;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Cat", "2");
        animal.sayAge();
        animal.sayName();

        Animal animal2 = new Animal();
        animal2.sayHello();
    }
}
