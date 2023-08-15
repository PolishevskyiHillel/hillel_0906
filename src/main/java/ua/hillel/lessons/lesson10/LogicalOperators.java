package ua.hillel.lessons.lesson10;

public class LogicalOperators {
    public static void main(String[] args) {
        twoOperatorAnd();
    }

    public static void twoOperatorOr() {
        int a = 10;
        if (++a == 12 || ++a == 10){
            ++a;
        }
        System.out.println(a);
    }

    public static void twoOperatorAnd() {
        int a = 10;
        if (++a == 10 & ++a == 12){
            ++a;
        }
        System.out.println(a);
    }

    public static void oneOperatorOr() {
        int mouse = 5;
        int weight = 45;

        if (mouse == 7 | weight < 100) {
            System.out.println("Можно кормить кота");
        }
    }

    public static void oneOperatorAnd() {
        int mouse = 5;
        int weight = 45;

        if (mouse != 100 & weight < 100) {
            System.out.println("Можно кормить кота");
        }
    }
}
