package homework.pizzeriaPalmetto.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Pizza {
    private String name;
    private List<Ingredients> ingredients;
    private PizzaType pizzaType;
    private int quantity;

}
