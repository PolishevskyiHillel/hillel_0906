package ua.hillel.lessons.lesson14.classes.inner;

public class StaticOuter {
    int num;

    static class InnerStaticDemo {
        public void my_method() {
            System.out.println("Это внутренний статический класс");
        }
    }
}
