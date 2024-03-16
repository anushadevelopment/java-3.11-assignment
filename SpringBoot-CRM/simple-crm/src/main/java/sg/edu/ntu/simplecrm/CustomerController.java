package sg.edu.ntu.simplecrm;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/customers")
public class CustomerController {
    
    private ArrayList<Customer> customers = new ArrayList<>();

    public CustomerController() {
        customers.add(new Customer("Bruce","Banner"));
        customers.add(new Customer("Peter", "Parker"));
        customers.add(new Customer("Stephen", "Strange"));
        customers.add(new Customer("Steve", "Roger"));
    }

    // Helper method
    private int getCustomerIndex(String id) {
        for(Customer customer: customers) {
            if(customer.getId().equals(id)){
                return customers.indexOf(customer);
            }
        }

        // Not found
        throw new CustomerNotFoundException(id);
    }


    // CREATE
    @PostMapping("") 
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        customers.add(customer);
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    // READ
    @GetMapping("")
    public ResponseEntity<ArrayList<Customer>> getAllCustomers() {
        return new ResponseEntity<>(customers, HttpStatus.OK);
    } // 200 OK

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable String id) {
        try {
            int index = getCustomerIndex(id);
            return new ResponseEntity<>(customers.get(index), HttpStatus.OK);
        } catch (CustomerNotFoundException ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    } // 200 OK

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable String id, @RequestBody Customer customer) {
        try {
            int index = getCustomerIndex(id);

            // if(index == -1) {
            //     customers.add(customer);
            //     return customer;
            // }

            customers.set(index, customer);
            return new ResponseEntity<>(customer, HttpStatus.OK);
        } catch (CustomerNotFoundException ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    } // 200 OK

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable String id) {
        try {
            int index = getCustomerIndex(id);
            return new ResponseEntity<>(customers.remove(index), HttpStatus.NO_CONTENT);
        } catch (CustomerNotFoundException ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    } // 204 NO CONTENT
}
