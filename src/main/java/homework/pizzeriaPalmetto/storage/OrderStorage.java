package homework.pizzeriaPalmetto.storage;

import homework.pizzeriaPalmetto.exception.NotFoundException;
import homework.pizzeriaPalmetto.model.Customer;
import homework.pizzeriaPalmetto.model.Ingredients;
import homework.pizzeriaPalmetto.model.Order;
import homework.pizzeriaPalmetto.model.Pizza;
import homework.pizzeriaPalmetto.util.NumberGenerator;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class OrderStorage {
    private List<Order> orderList = new ArrayList<>();
    private CustomerStorage customerStorage = new CustomerStorage();

    public void addOrder(Order order) {
        LocalTime now = LocalTime.now();
        order.setOrderTime(now);
        int generatedNumber = NumberGenerator.generateNumber();
        for (Order orderInList : orderList) {
            if (orderInList.getOrderNumber() == generatedNumber) {
                break;
            }
            order.setOrderNumber(generatedNumber);
            orderList.add(order);
        }
    }

    public Order getByNumber(int orderNumber) {
        for (Order order : orderList) {
            if (order.getOrderNumber() == orderNumber)
                return order;
        }
        return null;
    }

    public Order getByCustomerNumber(int number) {
        Customer customer = customerStorage.getByNumber(number);
        for (Order order : orderList) {
            if (order.getCustomer().equals(customer))
                return order;
        }
        return null;
    }

    public String printCheck(int orderNumber) throws NotFoundException {
        Order order = getByNumber(orderNumber);
        StringBuilder check = new StringBuilder();
        check.append("Order: ").append(order.getOrderNumber()).append("\n");
        check.append("Client: ").append(order.getCustomer()).append("\n");
        List<Pizza> orderPizzaList = order.getPizzaList();
        double totalAmount = 0.0;
        for (Pizza pizza : orderPizzaList) {
            String pizzaName = pizza.getName();
            check.append("...............").append("\n");
            check.append("Name: ").append(pizzaName).append("\n");
            check.append(pizza.getPizzaType().getName()).append(pizza.getPizzaType().getPrice()).append("\n");
            List<Ingredients> ingredients = pizza.getIngredients();
            double amount = 0.0;
            for (Ingredients ingredient : ingredients) {
                String ingredientName = ingredient.name();
                double ingredientPrice = ingredient.getPrice();

                check.append(ingredientName).append(ingredientPrice).append("\n");
                amount += ingredientPrice;
            }
            check.append("...............").append("\n");
            check.append("Amount").append(amount).append("\n");
            int quantity = pizza.getQuantity();
            check.append("Quantity:").append(quantity).append("\n");
            totalAmount += amount;
            check.append("...............").append("\n");
        }
        check.append("Total Amount:").append(totalAmount);
        return String.valueOf(check);
    }
}