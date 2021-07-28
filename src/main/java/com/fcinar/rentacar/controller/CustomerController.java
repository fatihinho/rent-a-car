package com.fcinar.rentacar.controller;

import com.fcinar.rentacar.dto.CreateCustomerRequest;
import com.fcinar.rentacar.model.Customer;
import com.fcinar.rentacar.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        return ResponseEntity.ok(customers);
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody CreateCustomerRequest createCustomerRequest) {
        return ResponseEntity.ok(customerService.createCustomer(createCustomerRequest));
    }
}
