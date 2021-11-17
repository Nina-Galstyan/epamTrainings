package homework.pizzeriaPalmetto;

import homework.pizzeriaPalmetto.exception.NotFoundException;
import homework.pizzeriaPalmetto.model.Order;
import homework.pizzeriaPalmetto.model.Pizza;
import homework.pizzeriaPalmetto.storage.OrderStorage;
import homework.pizzeriaPalmetto.storage.PizzaStorage;

import java.util.List;

public class Pizzeria {
    private static OrderStorage orderStorage = new OrderStorage();
    private static PizzaStorage pizzaStorage = new PizzaStorage();

    public static void main(String[] args) throws NotFoundException {

//    Implement method a main(). In it, implement and withdraw the following orders:
//            •	Customer number 7717 wants to order 2 pcs. "Margarita" and 3 pcs. the usual "PepperoniOro".
//            •	Customer with number 4372 wants to order delivery of 12 pcs. usual pizzas "BasePZZ".

        Order byNumber7717 = orderStorage.getByCustomerNumber(7717);
        Pizza margarita = pizzaStorage.addMargarita();
        margarita.setQuantity(2);
        List<Pizza> pizzaList = byNumber7717.getPizzaList();
        pizzaList.add(margarita);
        Pizza pepperoniOro = pizzaStorage.addPepperoniOro();
        pepperoniOro.setQuantity(3);
        pizzaList.add(pepperoniOro);


        Order byNumber4372 = orderStorage.getByCustomerNumber(4372);
        Pizza BasePZZ = pizzaStorage.addBasePZZ();
        margarita.setQuantity(12);
        List<Pizza> pizzaList2 = byNumber4372.getPizzaList();
        pizzaList.add(margarita);


    }
}
