package artniewski.springframework.spring5restweb.domain.repositories;

import artniewski.springframework.spring5restweb.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
