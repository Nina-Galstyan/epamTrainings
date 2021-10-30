package homework.pizzeriaPalmetto.storage.storageImpl;

import homework.pizzeriaPalmetto.exception.NotFoundException;
import homework.pizzeriaPalmetto.model.Ingredients;
import homework.pizzeriaPalmetto.model.Order;
import homework.pizzeriaPalmetto.model.Pizza;
import homework.pizzeriaPalmetto.model.PizzaType;
import homework.pizzeriaPalmetto.storage.PizzaStorage;

import java.util.ArrayList;
import java.util.List;

public class PizzaStorageImpl implements PizzaStorage {
    private List<Pizza> pizzaList = new ArrayList<>();
    private OrderStorageImpl orderStorage = new OrderStorageImpl();
    //    Check that the name of the pizza contains at least 4 and no more than 20 Latin characters.
    //    If the specified name does not satisfy this condition,
    //    the pizza is named "customer_name_n", where n is the index number of the pizza in the order.
    //   Customers can also give a name to your pizza and order up to 10 of them

    @Override
    public void addPizza(Pizza pizza) {
        if (pizza.getName().length() < 4 && pizza.getName().length() > 20) {
            pizza.setName("customer_name_" + pizzaList.indexOf(pizza));
        }
        if (pizza.getQuantity() < 10) {
            pizzaList.add(pizza);
        }
    }

    public Pizza getByName(String name) throws NotFoundException {
        for (Pizza pizza : pizzaList) {
            if (pizza.getName().equalsIgnoreCase(name)) {
                return pizza;
            }
        }
        throw new NotFoundException("Pizza with" + name + "does not exist");
    }

//    Implement an addIngredient() method that adds a new ingredient to the pizza.
//    If the pizza is already "full", a corresponding message should be displayed on the screen.
//    Make sure the ingredients are not duplicated, otherwise display a message asking you to check the order again.

    public void addIngredients(String name, Ingredients newIngredients) throws NotFoundException {
        Pizza pizza = getByName(name);
        if (pizza.getIngredients().size() >= 7) {
            System.out.println("Pizza is full");
        } else {
            if (pizza.getIngredients().contains(newIngredients)) {
                System.out.println("Please check oder again ");
            }
            pizza.getIngredients().add(newIngredients);
        }
    }
//    Implement a method for displaying pizza attributes,
//    in which data about pizza is displayed as follows:
//     [Order: Customer: Name: Quantity]
//    For instance: [10001 : 7717: Margarita: 2]

    public String showPizzaAttributes(int orderNumber) throws NotFoundException {
        Order order = orderStorage.getByNumber(orderNumber);
        StringBuilder attributes = new StringBuilder();
        attributes.append("[").append(order.getOrderNumber()).append(order.getCustomer());
        for (Pizza pizza : order.getPizzaList()) {
            attributes.append(pizza.getName()).append(":").append(pizza.getQuantity()).append("]");
        }
        return String.valueOf(attributes);
    }

    // Fill the Margarita pizza with the following ingredients: tomato paste, pepper, garlic, and bacon.
    @Override
    public Pizza addMargarita() throws NotFoundException {
        List<Ingredients> ingredientsForMargarita = new ArrayList<>();
        ingredientsForMargarita.add(0, Ingredients.TOMATO);
        ingredientsForMargarita.add(1, Ingredients.PEPPERONI);
        ingredientsForMargarita.add(2, Ingredients.GARLIC);
        ingredientsForMargarita.add(3, Ingredients.BACON);
        pizzaList.add(0, Pizza.builder()
                .name("Margarita")
                .ingredients(ingredientsForMargarita)
                .pizzaType(PizzaType.CLOSED)
                .build());
        Pizza margarita = getByName("Margarita");
        return margarita;
    }


    public Pizza addPepperoniOro() throws NotFoundException {
        List<Ingredients> ingredientsForPepperoniOro = new ArrayList<>();
        ingredientsForPepperoniOro.add(0, Ingredients.TOMATO);
        ingredientsForPepperoniOro.add(1, Ingredients.CHEESE);
        ingredientsForPepperoniOro.add(2, Ingredients.PEPPERONI);
        ingredientsForPepperoniOro.add(3, Ingredients.OLIVES);
        pizzaList.add(1, Pizza.builder()
                .name("PepperoniOro")
                .ingredients(ingredientsForPepperoniOro)
                .pizzaType(PizzaType.REGULAR)
                .build());
        Pizza peperoniOli = getByName("PeperoniOli");
        return peperoniOli;
    }

    //Fill another pizza with tomato paste, cheese, salami, olives.
    public Pizza addBasePZZ() throws NotFoundException {
        List<Ingredients> ingredientsForBasePZZ = new ArrayList<>();
        ingredientsForBasePZZ.add(0, Ingredients.TOMATO);
        ingredientsForBasePZZ.add(1, Ingredients.CHEESE);
        ingredientsForBasePZZ.add(2, Ingredients.SALAMI);
        ingredientsForBasePZZ.add(3, Ingredients.OLIVES);
        pizzaList.add(2, Pizza.builder()
                .name("Simple")
                .ingredients(ingredientsForBasePZZ)
                .pizzaType(PizzaType.REGULAR)
                .build());
        Pizza peperoniOli = getByName("PeperoniOli");
        return peperoniOli;
    }
}


