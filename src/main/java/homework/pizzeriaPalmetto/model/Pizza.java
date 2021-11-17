package pizzeriaPalmetto.model;


import java.util.List;
import java.util.Objects;

public class Pizza {
    private String name;
    private List<Ingredients> ingredients;
    private PizzaType pizzaType;
    private int quantity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return quantity == pizza.quantity &&
                Objects.equals(name, pizza.name) &&
                Objects.equals(ingredients, pizza.ingredients) &&
                pizzaType == pizza.pizzaType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ingredients, pizzaType, quantity);
    }

    public Pizza() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
