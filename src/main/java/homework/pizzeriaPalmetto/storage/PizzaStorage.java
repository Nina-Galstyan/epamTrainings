package homework.pizzeriaPalmetto.storage;

import homework.pizzeriaPalmetto.exception.NotFoundException;
import homework.pizzeriaPalmetto.model.Pizza;

public interface PizzaStorage {
    void addPizza(Pizza pizza);

    Pizza getByName(String name) throws NotFoundException;

    String showPizzaAttributes(int orderNumber) throws NotFoundException;

    Pizza addMargarita() throws NotFoundException;

    Pizza addBasePZZ() throws NotFoundException;

    Pizza addPepperoniOro() throws NotFoundException;
}
