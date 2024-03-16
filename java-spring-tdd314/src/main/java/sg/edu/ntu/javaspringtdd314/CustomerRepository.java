package sg.edu.ntu.javaspringtdd314;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
    // Custom query to find all customers with a certain first name
    List<Customer> findByFirstName(String firstName);
}
