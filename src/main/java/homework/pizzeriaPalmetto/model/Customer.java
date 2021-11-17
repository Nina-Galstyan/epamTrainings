package pizzeriaPalmetto.model;

import java.util.Objects;

public class Customer {
        private int custemerNumber;

    public int getCustemerNumber() {
        return custemerNumber;
    }

    public Customer() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer costumer = (Customer) o;
        return custemerNumber == costumer.custemerNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(custemerNumber);
    }

    public Customer(int custemerNumber) {
        this.custemerNumber = custemerNumber;
    }

    public void setCustemerNumber(int custemerNumber) {
        this.custemerNumber = custemerNumber;
    }
}
