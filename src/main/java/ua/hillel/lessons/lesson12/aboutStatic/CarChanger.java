package ua.hillel.lessons.lesson12.aboutStatic;

public class CarChanger {
    public static void main(String[] args) {
        Car.myStatic += 20;
        System.out.println(Car.myStatic);

        Car car1 = new Car();
        System.out.println("статическая переменная car1: " + car1.myStatic);
        car1.nonStatic += 20;
        System.out.println("НЕ статическая переменная car1: " + car1.myStatic);

        Car car2 = new Car();
        System.out.println("статическая переменная car1: " + car2.myStatic);
        System.out.println("НЕ статическая переменная car1: " + car2.myStatic);
    }
}
