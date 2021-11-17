package pizzeriaPalmetto;



import pizzeriaPalmetto.model.Ingredients;
import pizzeriaPalmetto.model.Pizza;
import pizzeriaPalmetto.model.PizzaType;
import pizzeriaPalmetto.storage.OrderStorage;
import pizzeriaPalmetto.storage.PizzaStorage;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    public static void main(String[] args) {
        PizzaStorage pizzaStorage = new PizzaStorage();
        OrderStorage orderStorage = new OrderStorage();

//       . Fill the Margarita pizza with the following ingredients: tomato paste, pepper, garlic, and bacon.
//          Fill another pizza with tomato paste, cheese, salami, olives.
        List<Ingredients> ingredientsForMargarita = new ArrayList<>();
        ingredientsForMargarita.add(0, Ingredients.TOMATO);
        ingredientsForMargarita.add(1, Ingredients.PEPPERONI);
        ingredientsForMargarita.add(2, Ingredients.GARLIC);
        ingredientsForMargarita.add(3, Ingredients.BACON);
        Pizza pizza = new Pizza();
        pizza.setName("Margarita");
        pizza.setIngredients(ingredientsForMargarita);
        pizza.setPizzaType(PizzaType.REGULAR);
        pizzaStorage.addPizza(pizza);
    }

}
