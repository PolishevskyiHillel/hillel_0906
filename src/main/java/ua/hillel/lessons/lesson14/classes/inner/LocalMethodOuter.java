package ua.hillel.lessons.lesson14.classes.inner;

public class LocalMethodOuter {

    void myLocalMethod() {
        int num = 888;

        class MethodInnerClass {
            public void print() {
                System.out.println("это внутренний класс метода " + num);
            }
        }
        MethodInnerClass methodInnerClass = new MethodInnerClass();
        methodInnerClass.print();
    }
}
