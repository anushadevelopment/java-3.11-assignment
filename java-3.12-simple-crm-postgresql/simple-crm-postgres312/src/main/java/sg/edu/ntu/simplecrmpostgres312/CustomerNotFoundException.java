package sg.edu.ntu.simplecrmpostgres312;

public class CustomerNotFoundException extends RuntimeException {
    CustomerNotFoundException(String id) {
        super("Could not find customer with id: " + id);
    }
}
