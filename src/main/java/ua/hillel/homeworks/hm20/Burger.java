package ua.hillel.homeworks.hm20;

import java.util.ArrayList;
import java.util.List;

class Burger {
    private int basePrice = 50;
    private List<Ingredients> ingredients = new ArrayList<>();

    public void addIngredient(Ingredients ingredients) {
        this.ingredients.add(ingredients);
    }

    public int getTotalPrice() {
        int totalPrice = basePrice;
        for (Ingredients ingredients : this.ingredients) {
            totalPrice += ingredients.getPrice();
        }
        return totalPrice;
    }
}