package com.learn2code.Shop.db.servis.impl;

import com.learn2code.Shop.db.Repository.CustomerRepository;
import com.learn2code.Shop.db.servis.api.CustomerService;
import com.learn2code.Shop.domain.Customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

        public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getCustomer() {
        return customerRepository.getAll();
    }

    @Override
    public Customer get(int id) {
        return customerRepository.get(id);
    }

    @Override
    public Integer add(Customer customer) {
        return customerRepository.add(customer);
    }
}
