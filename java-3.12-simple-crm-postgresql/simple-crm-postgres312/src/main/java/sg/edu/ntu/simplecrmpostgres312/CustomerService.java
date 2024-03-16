package sg.edu.ntu.simplecrmpostgres312;

import java.util.ArrayList;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    Customer getCustomer(Long id);
    ArrayList<Customer> getAllCustomers();
    Customer updateCustomer(Long id, Customer customer);
    void deleteCustomer(Long id);
    Interaction addInteractionToCustomer(Long id, Interaction interaction);
}
