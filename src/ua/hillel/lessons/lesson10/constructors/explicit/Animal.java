package ua.hillel.lessons.lesson10.constructors.explicit;

public class Animal {

    public Animal(){

    }

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private String age;

    void sayHello(){
        System.out.println("Hello");
    }

    void sayName(){
        System.out.println(this.name);
    }

    void sayAge(){
        System.out.println(this.age);
    }
}
