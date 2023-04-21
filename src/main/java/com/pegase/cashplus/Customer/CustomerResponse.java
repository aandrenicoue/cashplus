package com.pegase.cashplus.Customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
    private Integer cust_no;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String careers;
}
