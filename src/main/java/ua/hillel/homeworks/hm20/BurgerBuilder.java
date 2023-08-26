package ua.hillel.homeworks.hm20;

import java.util.Scanner;

public class BurgerBuilder {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Burger burger = new Burger();

        System.out.println("Добро пожаловать в Конструктор Бургера!");
        System.out.println("Базовая стоимость бургера: " + burger.getTotalPrice());

        for (Ingredients ingredients : Ingredients.values()) {
            System.out.println(ingredients.ordinal() + 1 + ". " + ingredients.getName() + " - " + ingredients.getPrice());
        }

        while (true) {
            System.out.print("Выберите номер или название ингредиента для добавления (или 'нет' для завершения): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("нет")) {
                break;
            }

            try {
                int choice = Integer.parseInt(input);
                if (choice >= 1 && choice <= Ingredients.values().length) {
                    burger.addIngredient(Ingredients.values()[choice - 1]);
                } else {
                    System.out.println("Неверный выбор ингредиента.");
                }
            } catch (NumberFormatException e) {
                boolean ingredientFound = false;
                for (Ingredients ingredients : Ingredients.values()) {
                    if (ingredients.getName().equalsIgnoreCase(input)) {
                        burger.addIngredient(ingredients);
                        ingredientFound = true;
                        break;
                    }
                }
                if (!ingredientFound) {
                    System.out.println("Ингредиент не найден.");
                }
            }

            System.out.print("Хотите добавить еще один ингредиент? (да/нет): ");
            String continueChoice = scanner.nextLine();
            if (!continueChoice.equalsIgnoreCase("да")) {
                break;
            }
        }

        System.out.println("Итоговая стоимость бургера: " + burger.getTotalPrice());
        System.out.println("Спасибо за заказ!");
    }
}