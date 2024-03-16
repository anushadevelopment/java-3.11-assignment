package sg.edu.ntu.simplecrmpostgres312;

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

    private CustomerService customerService;

    // @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // CREATE
    @PostMapping("") 
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer newCustomer = customerService.createCustomer(customer);
        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }

    // READ
    @GetMapping("")
    public ResponseEntity<ArrayList<Customer>> getAllCustomers() {
        ArrayList<Customer> allCustomers = customerService.getAllCustomers();
        return new ResponseEntity<>(allCustomers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Long id) {
        try {
            Customer foundCustomer = customerService.getCustomer(id);
            return new ResponseEntity<>(foundCustomer, HttpStatus.OK);
        } catch (CustomerNotFoundException ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    } // 200 OK

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        try {
            Customer updatedCustomer = customerService.updateCustomer(id, customer);
            return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
        } catch (CustomerNotFoundException ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    } // 200 OK

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable Long id) {
        try {
            customerService.deleteCustomer(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (CustomerNotFoundException ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    } // 204 NO CONTENT

    @PostMapping("/{id}/interactions")
    public ResponseEntity<Interaction> addInteractionToCustomer(@PathVariable Long id, @RequestBody Interaction interaction) {
        Interaction newInteraction = customerService.addInteractionToCustomer(id, interaction);
        return new ResponseEntity<>(newInteraction, HttpStatus.OK);
    }
}
