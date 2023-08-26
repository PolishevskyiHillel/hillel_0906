package ua.hillel.homeworks.hm20;

enum Ingredients {
    SAUCE("Соус", 10),
    CHEESE("Сыр", 20),
    PATTY("Котлета", 30);

    private final String name;
    private final int price;

    Ingredients(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}