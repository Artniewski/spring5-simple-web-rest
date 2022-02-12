package artniewski.springframework.spring5restweb.bootstrap;

import artniewski.springframework.spring5restweb.domain.Customer;
import artniewski.springframework.spring5restweb.domain.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Customer Data");

        Customer c1 = new Customer();
        c1.setFirstName("Adam");
        c1.setLastName("Kowalski");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Piotr");
        c2.setLastName("Nowak");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("Marek");
        c3.setLastName("Twardowski");
        customerRepository.save(c3);

        System.out.println("Customers Saved: " + customerRepository.count());
    }
}
