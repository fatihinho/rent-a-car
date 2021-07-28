package com.fcinar.rentacar.service;

import com.fcinar.rentacar.dto.CreateCustomerRequest;
import com.fcinar.rentacar.model.Customer;
import com.fcinar.rentacar.repository.ICustomerRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final ICustomerRepository customerRepository;

    public CustomerService(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer createCustomer(@NotNull CreateCustomerRequest createCustomerRequest) {
        Customer customer = new Customer(createCustomerRequest.getName(), createCustomerRequest.getSurname());
        return customerRepository.save(customer);
    }
}
