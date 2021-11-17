package homework.dtoValidation;


import homework.dtoValidation.dto.CustomerDto;
import homework.dtoValidation.validator.Validator;

import java.time.LocalDate;

public class Mail {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customerDto=new CustomerDto("A","annagmail.com", LocalDate.of(2021,5,11),120);
        Validator validator = new Validator();
        String errorMessage = validator.validate(customerDto);
        System.out.println(errorMessage);
    }
}
