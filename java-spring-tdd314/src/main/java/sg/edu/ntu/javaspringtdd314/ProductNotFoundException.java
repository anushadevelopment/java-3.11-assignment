package sg.edu.ntu.javaspringtdd314;

public class ProductNotFoundException extends RuntimeException {
    ProductNotFoundException(String id) {
        super("Could not find product with id: " + id);
    }
}
