package ua.hillel.lessons.lesson5.methods;

public class MethodStr {
    public static void main(String[] args) {
        stringEquals("Max", "Cat");
    }

    public static void stringReplace() {
        String str = "Hello Alex";
        String str2 = str.replace("Alex", "Maks");
        System.out.println(str2);
    }

    public static void stringSubString() {
        String str = "Hello world";
        System.out.println(str.substring(str.indexOf(" ")).trim());
    }

    public static void stringIndexOf() {
        String str = "Hello world";
        System.out.println(str.indexOf("o"));
//        System.out.println(str.lastIndexOf("o"));
    }

    public static void stringCharAt() {
        String str = "Hello world";
        System.out.println(str.charAt(1));
    }

    public static void stringContains() {
        String str = "Hello world";
        if (str.contains("world")) {
            System.out.println("Str are contains");
        } else {
            System.out.println("Str aren't contains");

        }
    }

    public static void stringEquals(String str, String str2) {
        if (str.equals(str2)) {
            System.out.println("Str are equals");
        } else {
            System.out.println("Str aren't equals");
        }
    }

    public static void stringToUppercase() {
        String str = "Hello World".toUpperCase();
        System.out.println(str);
    }

    public static void stringEndsWith() {
        String str = "Hello World";
        boolean end1 = str.endsWith("World");
        boolean end2 = str.endsWith("Alex");
        System.out.println(end1);
        System.out.println(end2);
    }

    public static void stringTrim() {
        String str = "      Hello      ";
        System.out.println(str);
        System.out.println(str.trim());
    }

    public static void stringConcat() {
        String str = "Hello";
        String str2 = "Maks";
        String result = str.concat(str2);
        System.out.println(result);
    }

    public static void stringLength() {
        String str = "Hello world";
        System.out.println(str);
    }
}
