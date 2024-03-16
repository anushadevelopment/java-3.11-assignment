package sg.edu.ntu.simplecrm1;

public class CustomerNotFoundException extends RuntimeException {
    CustomerNotFoundException(String id) {
        super("Could not find customer with id: " + id);
    }
}
