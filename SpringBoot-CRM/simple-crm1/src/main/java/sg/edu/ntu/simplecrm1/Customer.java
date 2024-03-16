package sg.edu.ntu.simplecrm1;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private final String id;
    private String firstName;
    private String lastName;
    private String email;
    private String contactNo;
    private String jobTitle;
    private int yearOfBirth;
    
    public Customer() {
        this.id = UUID.randomUUID().toString();
    }

    public Customer(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if(yearOfBirth < 0) {
            return;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }
}
