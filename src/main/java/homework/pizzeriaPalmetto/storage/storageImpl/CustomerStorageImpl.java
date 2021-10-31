package homework.pizzeriaPalmetto.storage.storageImpl;

import homework.pizzeriaPalmetto.model.Customer;
import homework.pizzeriaPalmetto.storage.CustomerStorage;
import homework.pizzeriaPalmetto.util.NumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class CustomerStorageImpl implements CustomerStorage {
    List<Customer> customerList = new ArrayList<>();

    @Override
    public void addCustomer(Customer customer) {
        int customerNumber = NumberGenerator.generateNumber();
        for (Customer customerInList : customerList) {
            if (customerInList.getCustemerNumber() == customerNumber) {
                break;
            } else {
                customer.setCustemerNumber(customerNumber);
                customerList.add(customer);
            }
        }
    }

    public Customer getByNumber(int number) {
        for (Customer customer : customerList) {
            if (customer.getCustemerNumber() == number)
                return customer;
        }
        return null;
    }
}