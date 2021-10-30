package homework.pizzeriaPalmetto.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Data
@Builder
public class Order {
    private int orderNumber;
    private Customer customer;
    private List<Pizza> pizzaList;
    private LocalTime orderTime;

}
