package ua.hillel.lessons.lesson15.exeptions.customexception;

public class MyExceptionDemo {

    public static void main(String[] args) throws MyException {
        compute(7);
        compute(12);
    }

    static void compute(int a) throws MyException {
        if (a > 10) {
            throw new MyException("Some message ", a);
        }
        System.out.println("Дальнейшая работа программы");
    }
}
