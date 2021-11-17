package pizzeriaPalmetto.model;

public enum Ingredients {
    TOMATO(1),
    CHEESE(1),
    SALAMI(1.5),
    BACON(1.2),
    GARLIC(0.3),
    CORN(0.7),
    PEPPERONI(0.6),
    OLIVES(0.5);

    private double price;

    Ingredients(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
}
