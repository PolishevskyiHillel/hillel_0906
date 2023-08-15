package ua.hillel.lessons.lesson13.enums;

public class LaunchForEnumWithConstructor {
    public static void main(String[] args) {
        for (EnumWithConstructor e : EnumWithConstructor.values()) {
            if (e.currency == null) {
                System.out.println(e);
            } else {
                System.out.println(e + ", " + e.currency);
            }
        }
    }
}
