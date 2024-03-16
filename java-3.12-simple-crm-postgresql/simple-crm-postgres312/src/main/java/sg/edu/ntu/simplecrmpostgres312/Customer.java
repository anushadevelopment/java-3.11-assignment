package sg.edu.ntu.simplecrmpostgres312;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customer")
@NoArgsConstructor
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

    @OneToMany(mappedBy = "customer")
    private List<Interaction> interactions;

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
