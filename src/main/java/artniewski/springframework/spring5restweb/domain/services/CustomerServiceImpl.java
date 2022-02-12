package artniewski.springframework.spring5restweb.domain.services;

import artniewski.springframework.spring5restweb.domain.Customer;
import artniewski.springframework.spring5restweb.domain.repositories.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.getById(id);
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }
}
