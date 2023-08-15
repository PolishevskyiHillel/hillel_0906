package ua.hillel.lessons.lesson14.initializationblock;

public class Dog {
    private String name;
    private String breed;
    private int age;

    {
        System.out.println("Hello world");
        name = "Rex";
        breed = "Putin";
        age = 80;
    }

    static String lastName;
    static {
        System.out.println("Hello world from Static block");
        lastName = "Rexovich";
    }

    public Dog() {
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
