package ua.hillel.lessons.lesson10;

public class TernaryOperator {
    public static void main(String[] args) {
        conditionTernary("Hodor");
        conditionTernary("Hodor!");
    }

    public static void conditionTernary(String str) {
        var lastChar = str.charAt(str.length() - 1);
        var result =  lastChar == '!' ? "question" : "No question";
        System.out.println(result);
    }

    public static void conditionSimple(String str) {
        var lastChar = str.charAt(str.length() - 1);
        if (lastChar == '?') {
            System.out.println("question");
        } else {
            System.out.println("No question");
        }
    }
}
