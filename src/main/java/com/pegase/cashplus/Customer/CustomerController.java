package com.pegase.cashplus.Customer;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
@Tag(name = "Customer")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("list")
    public ResponseEntity<List<CustomerResponse>> getCustomerList (){
        return ResponseEntity.ok(customerService.getPaginateCustomer());
    }

}
