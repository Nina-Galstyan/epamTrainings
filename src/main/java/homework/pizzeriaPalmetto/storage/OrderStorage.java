package homework.pizzeriaPalmetto.storage;

import homework.pizzeriaPalmetto.exception.NotFoundException;
import homework.pizzeriaPalmetto.model.Order;

public interface OrderStorage {
    void addOrder(Order order);

    Order getByNumber(int orderNumber) throws NotFoundException;

    String printCheck(int orderNumber) throws NotFoundException;
}
