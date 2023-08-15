package ua.hillel.lessons.lesson5.methods;

public class MethodExample {

    public static void main(String[] args) {
        System.out.println(returnHelloImper());
        String sayHello = returnHelloDeklar();
        System.out.println(sayHello);

        System.out.println(plus());

        int minus = plus() - 1;
        System.out.println(minus);
    }

    public static int plus() {
        int result = 2 + 2;
        return result;
    }

    public static int plusDeclar() {
        return 2 + 2;
    }

    public static String returnHelloImper() {
        String helloStr = "Hello";
        return helloStr;
    }

    public static String returnHelloDeklar() {
        return "hello";
    }

    public static void seyHello() {
        System.out.println("Hello");
    }


}
