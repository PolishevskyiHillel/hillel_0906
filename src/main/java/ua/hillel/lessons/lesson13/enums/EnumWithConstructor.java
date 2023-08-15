package ua.hillel.lessons.lesson13.enums;

public enum EnumWithConstructor {
    CANADA("CAD"),
    POLAND("ZLT"),
    GERMANY("EUR"),
    UKRAINE,
    USA;

    String currency;

    EnumWithConstructor() {
    }

    EnumWithConstructor(String currency) {
        this.currency = currency;
    }
}
