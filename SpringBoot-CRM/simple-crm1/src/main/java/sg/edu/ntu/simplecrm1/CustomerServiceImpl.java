package sg.edu.ntu.simplecrm1;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class CustomerServiceImpl implements CustomerService {
    
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.createCustomer(customer);
    }

    public Customer getCustomer(String id) {
        return customerRepository.getCustomer(getCustomerIndex(id));
    }

    public ArrayList<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

    public Customer updateCustomer(String id, Customer customer) {
        return customerRepository.updateCustomer(getCustomerIndex(id), customer);
    }

    public void deleteCustomer(String id) {
        customerRepository.deleteCustomer(getCustomerIndex(id));
    }


    // Helper method
    private int getCustomerIndex(String id) {
        for(Customer customer: customerRepository.getAllCustomers()) {
            if(customer.getId().equals(id)){
                return customerRepository.getAllCustomers().indexOf(customer);
            }
        }

        // Not found
        throw new CustomerNotFoundException(id);
    }

}
