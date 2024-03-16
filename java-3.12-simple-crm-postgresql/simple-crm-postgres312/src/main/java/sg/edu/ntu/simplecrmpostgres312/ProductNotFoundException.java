package sg.edu.ntu.simplecrmpostgres312;

public class ProductNotFoundException extends RuntimeException {
    ProductNotFoundException(String id) {
        super("Could not find product with id: " + id);
    }
}
