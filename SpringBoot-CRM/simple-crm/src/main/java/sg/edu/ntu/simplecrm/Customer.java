// package sg.edu.ntu.simplecrm;

// import java.util.UUID;

// public class Customer {
//     private final String id;
//     private String firstName;
//     private String lastName;
//     private String email;
//     private String contactNo;
//     private String jobTitle;
//     private int yearOfBirth;
    
//     public Customer(){
//         this.id = UUID.randomUUID().toString();
//     }

//     public Customer(String firstName, String lastName){
//         this();
//         this.firstName = firstName;
//         this.lastName = lastName;
//     }


//     public String getId() {
//         return id;
//     }
//     // public void setId(String id) {
//     //     this.id = id;
//     // }
//     public String getFirstName() {
//         return firstName;
//     }
//     public void setFirstName(String firstName) {
//         this.firstName = firstName;
//     }
//     public String getLastName() {
//         return lastName;
//     }
//     public void setLastName(String lastName) {
//         this.lastName = lastName;
//     }
//     public String getEmail() {
//         return email;
//     }
//     public void setEmail(String email) {
//         this.email = email;
//     }
//     public String getContactNo() {
//         return contactNo;
//     }
//     public void setContactNo(String contactNo) {
//         this.contactNo = contactNo;
//     }
//     public String getJobTitle() {
//         return jobTitle;
//     }
//     public void setJobTitle(String jobTitle) {
//         this.jobTitle = jobTitle;
//     }
//     public int getYearOfBirth() {
//         return yearOfBirth;
//     }
//     public void setYearOfBirth(int yearOfBirth) {
//         this.yearOfBirth = yearOfBirth;
//     }

    
// }


package sg.edu.ntu.simplecrm;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "contact_no")
    private String contactNo;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "year_of_birth")
    private int yearOfBirth;

    public Customer(String firstName, String lastName) {
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
