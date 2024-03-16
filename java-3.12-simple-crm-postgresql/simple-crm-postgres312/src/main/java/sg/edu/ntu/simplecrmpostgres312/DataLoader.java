package sg.edu.ntu.simplecrmpostgres312;


import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DataLoader {
    private CustomerRepository customerRepository;

    // @Autowired
    public DataLoader(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostConstruct
    public void loadData() {
        // clear the database first
        customerRepository.deleteAll();

        // load data here
        customerRepository.save(new Customer("Tony", "Stark"));
        customerRepository.save(new Customer("Bruce", "Banner"));
        customerRepository.save(new Customer("Peter", "Parker"));
        customerRepository.save(new Customer("Stephen", "Strange"));
    }
}

