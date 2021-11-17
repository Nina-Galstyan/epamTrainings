package homework.pizzeriaPalmetto.model;


import java.time.LocalTime;
import java.util.List;

public class Order {
    private int orderNumber;
    private Customer customer;
    private List<Pizza> pizzaList;
    private LocalTime orderTime;

    public Order(int orderNumber, Customer customer, List<Pizza> pizzaList, LocalTime orderTime) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.pizzaList = pizzaList;
        this.orderTime = orderTime;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public LocalTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalTime orderTime) {
        this.orderTime = orderTime;
    }
}
