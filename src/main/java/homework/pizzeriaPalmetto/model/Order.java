package pizzeriaPalmetto.model;


import java.time.LocalTime;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Order {
    private int orderNumber;
    private Customer customer;
    private List<Pizza> pizzaList;
    private LocalTime orderTime;

    public Order() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderNumber == order.orderNumber &&
                Objects.equals(customer, order.customer) &&
                Objects.equals(pizzaList, order.pizzaList) &&
                Objects.equals(orderTime, order.orderTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, customer, pizzaList, orderTime);
    }

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