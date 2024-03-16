package sg.edu.ntu.simplecrm1;

public class ProductNotFoundException extends RuntimeException {
    ProductNotFoundException(String id) {
        super("Could not find product with id: " + id);
    }
}
