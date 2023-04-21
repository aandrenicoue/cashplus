package com.pegase.cashplus.Customer;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class CustomerService {
    private  final CustomerRepository customerRepository;
    private  final CustomerMapper customerMapper;

    public List<CustomerResponse> getPaginateCustomer() {
        return customerRepository.findAll()
                .stream()
                .map(customerMapper::toResponse)
                .collect(Collectors.toList());
    }
}
