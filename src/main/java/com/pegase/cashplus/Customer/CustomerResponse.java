package com.pegase.cashplus.Customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
    private Integer cust_no;
    private String firstName;
    private String lastName;
    private String birthday;
    private String careers;
}
