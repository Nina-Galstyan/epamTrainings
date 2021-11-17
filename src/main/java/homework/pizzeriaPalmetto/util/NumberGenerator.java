package pizzeriaPalmetto.util;

import java.util.Random;

public class NumberGenerator {
    public static int generateNumber() {
        Random random = new Random();
        return ((1 + random.nextInt(2)) * 10000 + random.nextInt(10000));
    }
}
