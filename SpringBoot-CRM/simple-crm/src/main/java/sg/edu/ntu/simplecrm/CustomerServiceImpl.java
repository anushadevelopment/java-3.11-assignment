package sg.edu.ntu.simplecrm;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public Customer createCustomer(Customer customer) {
        Customer newCustomer = customerRepository.save(customer);
        return newCustomer;
    }

    @Override
    public Customer getCustomer(Long id) {
        Customer foundCustomer = customerRepository.findById(id).get();
        return foundCustomer;
    }

    @Override
    public ArrayList<Customer> getAllCustomers() {
        List<Customer> allCustomers = customerRepository.findAll();
        return (ArrayList<Customer>) allCustomers;
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        // retrieve the customer from the database
        Customer customerToUpdate = customerRepository.findById(id).get();

        // update the customer retrieved from the database
        customerToUpdate.setFirstName(customer.getFirstName());
        customerToUpdate.setLastName(customer.getLastName());
        customerToUpdate.setEmail(customer.getEmail());
        customerToUpdate.setContactNo(customer.getContactNo());
        customerToUpdate.setJobTitle(customer.getJobTitle());
        customerToUpdate.setYearOfBirth(customer.getYearOfBirth());

        // save the update customer back to the database
        return customerRepository.save(customerToUpdate);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

}
