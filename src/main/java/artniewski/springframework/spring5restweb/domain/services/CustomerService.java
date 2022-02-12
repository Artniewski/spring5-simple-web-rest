package artniewski.springframework.spring5restweb.domain.services;

import artniewski.springframework.spring5restweb.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();

}
