package homework.pizzeriaPalmetto.model;

import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

public class Pizza {
    public Pizza() {
    }

    private String name;
    private List<Ingredients> ingredients;
    private PizzaType pizzaType;
    private int quantity;
   private LocalTime orderTime;

    public Pizza(String name, List<Ingredients> ingredients, PizzaType pizzaType, int quantity, LocalTime orderTime) {
        this.name = name;
        this.ingredients = ingredients;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        this.orderTime = orderTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return quantity == pizza.quantity &&
                Objects.equals(name, pizza.name) &&
                Objects.equals(ingredients, pizza.ingredients) &&
                pizzaType == pizza.pizzaType &&
                Objects.equals(orderTime, pizza.orderTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ingredients, pizzaType, quantity, orderTime);
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

    public LocalTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalTime orderTime) {
        this.orderTime = orderTime;
    }
}
