package com.pegase.cashplus.Customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    public CustomerResponse toResponse(Customer customer) {
        return CustomerResponse.builder()
                .cust_no(customer.getCust_no())
                .lastName(customer.getLastName())
                .firstName(customer.getFirstName())
                .careers(customer.getCareers())
                .birthday(customer.getBirthday())
                .build();
    }
}
