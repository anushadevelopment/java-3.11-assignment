package sg.edu.ntu.javaspringtdd314;

public class CustomerNotFoundException extends RuntimeException {
    CustomerNotFoundException(Long id) {
        super("Could not find customer with id: " + id);
    }
}
