package ua.hillel.lessons.lesson7.stringpool;

public class StringPoolExample {

    public static void main(String[] args) {
        String str1 = "TopJava";
        String str2 = "TopJava";

        String str3 = new String("TopJava").intern();
        String str4 = new String("TopJava").intern();

        System.out.println(str1 == str2);

        System.out.println(str3 == str4);

        System.out.println(str1 == str3);
    }
}
