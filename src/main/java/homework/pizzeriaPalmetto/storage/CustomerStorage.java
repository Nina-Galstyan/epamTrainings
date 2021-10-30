package homework.pizzeriaPalmetto.storage;

import homework.pizzeriaPalmetto.model.Customer;

public interface CustomerStorage {
    void addCustomer(Customer customer);

    public Customer getByNumber(int number);
}
